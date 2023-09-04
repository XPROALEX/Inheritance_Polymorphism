public class Tester {
    public static void main(String[] args) {
        Animal animal = new Animal("NoName");
        Lion lion = new Lion("Simba");
        Cow cow = new Cow("Mucca");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}
