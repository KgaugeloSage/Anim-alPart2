public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eats() ;   // -> 'Food'
        dog.sounds(); // -> 'Barks'

        Cat cat = new Cat();

        cat.eats();    // -> 'Food'
        cat.sounds(); // -> 'Meow'


    }
}

