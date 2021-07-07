import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import java.util.Arrays;
import java.util.ArrayList;

public class RedactorTest {

    private ArrayList<String> wordsToRedact;

    @Before
    public void init() {
        wordsToRedact = new ArrayList<>();
    }

    @Test
    public void emptySentence_emptyWordsToRedact() {
        assertEquals("", Redactor.redactedSentence("", wordsToRedact));
    }

    @Test
    public void emptySentence_nonEmptyWordsToRedact() {
        wordsToRedact.add("foo");

        assertEquals("", Redactor.redactedSentence("",wordsToRedact));
    }

    @Test
    public void nonEmptySentence_emptyWordsToRedact() {
        assertEquals("Verily, I be not empty.", Redactor.redactedSentence("Verily, I be not empty.",wordsToRedact));
    }

    @Test
    public void nonEmptySentence_nonEmptyWordsToRedact_noMatches() {
        wordsToRedact.add("foo");
        wordsToRedact.add("bee");
        wordsToRedact.add("nut");

        assertEquals("Verily, I be not empty.", Redactor.redactedSentence("Verily, I be not empty.",wordsToRedact));
    }

    @Test
    public void nonEmptySentence_nonEmptyWordsToRedact_matches() {
        wordsToRedact.add("Veri");
        wordsToRedact.add("be");
        wordsToRedact.add("empty");

        assertEquals("****ly, I ** not *****.", Redactor.redactedSentence("Verily, I be not empty.",wordsToRedact));
    }
}