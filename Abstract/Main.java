package Abstract;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Wolf", "Big", 50);
        Dog dog = new Dog("Wolf", "Small", 25);
        doAnimalStuff(dog);
        DogTest dogTest = new DogTest("Dog test", 20);
        animalTest(dogTest);
        Fish fish = new Fish("FishGold", "Big", 10);
        ArrayList<Animal> animals = new ArrayList<>(List.of(dog, fish));
        Horse horse = new Horse("White", "Big", 150);
        animals.add(horse);
        for (Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMammal) {
                currentMammal.sheHair();
            }
        }
    }
    private static void doAnimalStuff(Animal animal){
        animal.move("Slow");
        animal.makeNoise();
    }
    private static void animalTest(AnimalTest animalTest){
        animalTest.move("Quickly");
        animalTest.makeNoise();
    }

}
