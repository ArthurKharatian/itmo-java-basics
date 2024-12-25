package lesson4;

import lesson2.Car;
import lesson2.Color;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ints = new int[6];

        ints[0] = 20;
        ints[1] = 321;
        ints[2] = 230;
        ints[3] = 520;
        ints[4] = 2;
        ints[5] = 10;

//        System.out.println(Arrays.toString(ints));

        String[] strings = new String[5];
        strings[3] = "Hello!";
//        System.out.println(Arrays.toString(strings));

        long[] longs = new long[]{122L, 321L, 333L};
//        System.out.println(Arrays.toString(longs));

        long[] longs2 = {122L, 321L, 333L};


        Car[] cars = new Car[3];

        cars[0] = new Car("KIA", Color.WHITE);
//        cars[1] = new Car();
        cars[2] = new Car("LADA", Color.GREEN);

//        System.out.println(Arrays.toString(cars));


//        int[][] arr = new int[2][3];

        int a = 0;

        a = a + 1;
        a++;
        a = a - 1;
        a--;

//        for (int i = 0; i < longs.length; i++) {
//            if (longs[i] % 2 == 0) {
//                System.out.println(longs[i]);
//            }
//        }

//        for (Car car : cars) {
//            if (car != null && car.getColor() == Color.WHITE) {
//                System.out.println(car);
//            }
//        }

        int x = 0;

//        do {
//            //logic
//            System.out.println(x++);
//        } while (x != 10);

//        while (x != 5) {
//            x++;
//
//            if (x < 2) {
//                continue;
//            }
//
//            System.out.println(x);
//
//            if (x == 3) {
//                break;
//            }
//        }

//        varargMethod("Hello");
//        varargMethod("Hello", "world", "!");


//        Arrays.sort(ints);
//        System.out.println(Arrays.toString(ints));
//
//        int i = Arrays.binarySearch(ints, 230);
//        int y = Arrays.binarySearch(ints, 100);
//
//        int res = Arrays.binarySearch(ints, 2);
//        System.out.println(i);
//        System.out.println(res);
//        System.out.println(y);

    }


//    public static void varargMethod(Integer num, String... line) {
//        for (String s : line) {
//            System.out.println(s);
//        }
//    }
}
