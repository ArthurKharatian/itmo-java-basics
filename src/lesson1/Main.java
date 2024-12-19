package lesson1;

import java.util.Scanner;

/**
 * author Arthur Kharatian
 */
// PascalCase  camelCase snake_case CONSTANT_VAR
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        print();

//        System.out.println(isTrue());

        byte b = 100;
        short s = 123;
        int i = 500;
        long l = 50000000000L;
        float f = 12.3f;
        double d = 14.5;

        char c = 'a';
        char charNum = 225;

//        System.out.println(c);

        boolean isTrue = true;

//        byte result = (byte)(b + i);
//        int result = b + i;
//        System.out.println(result);

//        double result = (double) i / s;
//        double result = i * 1.0 / s;
//        double result = i * 1d / s;

//        System.out.println(result);

        if (true) {
            //logic
        }

        if (false) {
            //logic
        } else {
            //logic
        }


        if (false) {
            //logic
        } else if (true) {
            //logic
        } else if (true) {
            //logic
        } else if (true) {
            //logic
        } else if (true) {
            //logic
        } else {
            //logic   // <- опциональный блок
        }

        int x = 11;
        int y = 20;

        // x == y; x != y; x > y; x < y; x >= y; x <= y; x % 2 == 0;

//        if (x % 2 != 0) {
//            System.out.println("OK!");
//        }

//        if (x % 2 != 0 && x != y) {
//            System.out.println("OK!");
//        }

//        if (x % 2 != 0 || x != y) {
//            System.out.println("OK!");
//        }
//        int z;
//
//        if (x == 11) {
//            z = x;
//        } else {
//            z = y;
//        }

//        int z = x == 11 ? x : y;

//        int a = 3;
//
//        int z = a == 3 ? x == 11 ? 20 : 50 : 500;
//
//        System.out.println(z);

//        switcher(10);

//        String result = switcher2(20);
//        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number = scanner.nextInt();

        System.out.println(line);
        System.out.println(number);

    }

    public static void print() {
        System.out.println("Hello world!");
    }

    public static boolean isTrue() {
        return true;
    }

    public static void switcher(int number) {
        int x;

        switch (number) {
            case 10:
                x = number;
                break;   // <- если не указать, то алгоритм идет к следующему кейсу

            case 20:
                x = number + number;
                break;
            default:
                x = 1000;
        }

        System.out.println(x);
    }

    public static String switcher2(int number) {
        switch (number) {
            case 10:
                return "ten";

            case 20:
                return "twenty";

            default:
                return "Illegal number";
        }
    }

    public void someMethod() {
        System.out.println("Hello from github");
    }
}



