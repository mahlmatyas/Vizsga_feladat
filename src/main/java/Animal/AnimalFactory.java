package Animal;

public class AnimalFactory {
    public Animal create(String animal) {


        if(animal == "dog"){
            return new Dog();
        }else if(animal == "cat"){
            return new Cat();
        }else if(animal == "cow"){
            return new Cow();
        }else if (animal == "duck"){
            return new Duck();
        }
        return null;
    }
}