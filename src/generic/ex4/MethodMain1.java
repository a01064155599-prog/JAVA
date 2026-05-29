package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이"  , 10);

        AnimalMethod.checkup(dog);



    }
}
