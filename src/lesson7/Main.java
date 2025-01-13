package lesson7;

public class Main {

    public static void main(String[] args) {
//    OuterClass.InnerClass innerClass = new OuterClass.InnerClass(); создание невозможно
//        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
//        nestedStaticClass.nestedStaticClassMethod();


        SomeInterface someObject = new SomeInterface() {
            @Override
            public void print() {
                System.out.println(name());
            }

            @Override
            public String name() {
                return "John";
            }
        };

        someObject.print();
    }
}
