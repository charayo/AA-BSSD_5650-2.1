public class Duck extends Animal {
    public Duck(){
        covering = "feathers";
    }
    public String eat() {
        return "ate some bread";
    }

    @Override
    public String speak() {
        return "quacks";
    }
}
