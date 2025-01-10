package lesson6;

public class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    public void someMethod() {
        super.age = 123;
    }

    @Override
    public void print() {
        System.out.println("Child overridden method");
    }
}
