import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTests {
    Cat testCat = new Cat();
    Dog testDog = new Dog();

@Test
    void TestDogSound(){
    System.out.println("Does dog Bark");
    assertEquals("Bark",testDog.sounds());

}
@Test
    void TestDogEats(){

    System.out.println("Does dog eat food");
    assertEquals("Food",testDog.eats());
}
@Test
    void TestCatSound(){
    System.out.println("Does cat Meow");
    assertEquals("Meow",testCat.sounds());
}
@Test
    void TestCatEats(){
    System.out.println("Does cat eat food");
    assertEquals("Food",testCat.eats());
}

}
