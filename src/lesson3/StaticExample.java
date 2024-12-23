package lesson3;

public class StaticExample {
    private String string;
    Integer number;
    protected String protectedString;
    public static String staticString;

    public static final String STATIC_CONSTANT = "static constant";
    public static final String STATIC_CONSTANT2 = "static constant 2";

    private final String nonStatic;

    static  {
        System.out.println("====================");
        System.out.println("static block start");
        staticString = "static string";
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("====================");
    }

    {
        System.out.println("====================");
        System.out.println("non-static block start");
        nonStatic = "non static string";
        System.out.println(nonStatic);
        System.out.println("non-static block end");
        System.out.println("====================");
    }

    public static void main(String[] args) {
//        new StaticExample();



        String s = "123";
//        int num = Integer.parseInt(s);
//
//        System.out.println(num);


//        StaticExample staticExample = null;
//        staticExample.someMethod();

        Integer integer = null;
        int num = integer.parseInt(s); // некорректный вызов
        System.out.println(num);

       int result = Integer.parseInt(s);
        System.out.println(result);

    }

    public static void printStaticVar() {
//        nonStatic = "123";  недоступно
        System.out.println(staticString);
        System.out.println(new StaticExample().getNonStatic());
    }

    public String getNonStatic() {
        return nonStatic;
    }

    public void someMethod() {
        System.out.println(staticString);
        System.out.println(nonStatic);
    }
}
