package lesson6;

public class Parent {

    private String name;
    protected Integer age;

    public Parent(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Method from " + this.getClass().getSimpleName() + " class");
    }
}
