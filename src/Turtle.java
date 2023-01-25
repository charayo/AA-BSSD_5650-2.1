public class Turtle extends Animal{
    public Turtle(){
        covering = "shell";
    }
    @Override
    public String eat() {
        return "ate some sea grasses";
    }

    @Override
    public String speak() {
        return "grunts";
    }
}
