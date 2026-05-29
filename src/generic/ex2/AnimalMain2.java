package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog); // Animal = Dog
        animalBox.set(cat); // Animal = Cat
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);

        /*
        Box<Dog> dogBox = new Box<>();
        dogBox.setT(new Dog("Dog", 10));

        System.out.println(dogBox.getT());

        Cat cat = new Cat("Cat", 10);
        Box<Cat> catBox = new Box<>();
        catBox.setT(cat);
        System.out.println(catBox.getT()); // 객체를 출력할 때 내부적으로 toString()을 호출
        */
    }
}