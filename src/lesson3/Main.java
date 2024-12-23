package lesson3;

import lesson2.Car;
import lesson2.Color;

import static lesson3.StaticExample.STATIC_CONSTANT;
import static lesson3.StaticExample.STATIC_CONSTANT2;
import static lesson3.StaticExample.printStaticVar;


public class Main {
    public static void main(String[] args) {
//        System.out.println(STATIC_CONSTANT);
//        System.out.println(STATIC_CONSTANT2);
//        StaticExample.printStaticVar();
//
//        StaticExample staticExample = null;
//        staticExample.printStaticVar(); // некорректный вызов
//
//        Car car = new Car();

//        printStaticVar();


        Sun sun = Sun.getSun();
        sun.setColor(Color.BLACK);
        sun.setSize(555);


        Sun sun2 = Sun.getSun();
        sun2.setColor(Color.GREEN);
        sun2.setSize(777);

        System.out.println(sun);
        System.out.println(sun2);
    }
}
