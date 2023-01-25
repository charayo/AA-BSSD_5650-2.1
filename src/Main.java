public class Main {
    public static void main(String[] args) {
        Animal animal = new Duck();
        Animal dog = new Dog();
        Animal turtle = new Turtle();
        careFor(animal);
        careFor(dog);
        careFor(turtle);
    }

    private static void careFor(Animal animal){
        System.out.println(animal.speak());
        System.out.println(animal.eat());
        System.out.println(animal.pet());
    }
}