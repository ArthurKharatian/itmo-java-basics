package lesson7;

public class OuterClass {
    private int a;
    private int b;

    static String name = "Mike";

    private void setParams(int x, int y) {
        this.a = x;
        this.b = y;
    }

    class InnerClass {
        void sumAndPrint() {
            setParams(4, 6);
            System.out.println("sum = " + (a + b));
        }
    }

    public void innerMethodCall() {
        InnerClass innerClass = new InnerClass();
        innerClass.sumAndPrint();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.innerMethodCall();
    }

    static class NestedStaticClass {
        void nestedStaticClassMethod() {
            System.out.println("Static nested");
            System.out.println(name);
//            System.out.println("sum = " + (a + b));  обращение невозможно
        }
    }

}
