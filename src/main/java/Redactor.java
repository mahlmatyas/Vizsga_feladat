import java.util.ArrayList;

class Redactor {
    public static String redactedSentence(String originalSentence, ArrayList<String> wordToRedact) {

        String result = originalSentence;
        for (int i = 0; i < wordToRedact.size(); i++) {
            result = result.replaceAll(wordToRedact.get(i),getMask(wordToRedact.get(i)));
        }
        return result;

        //for (String val : wordToRedact) {
        //    result = result.replaceAll(val, getMask(val));
        //}
        //return result;

        //int i = 0;
        //while (i < wordToRedact.size()) {
        //    result = result.replaceAll(wordToRedact.get(i),getMask(wordToRedact.get(i)));
        //    i++;
        //}
        //return result;
    }

    public static String getMask(String value){
        String res = "";
        for (int i = 0; i < value.length(); i++) {
            res = res + "*";
        }
        return res;
    }
}