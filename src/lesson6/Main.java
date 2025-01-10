package lesson6;

import lesson2.Color;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        Field[] declaredFields = car.getClass().getDeclaredFields();
//
//        for (Field field : declaredFields) {
//            System.out.println(field);
//        }

//        Parent parent = new Parent("John");
//        Parent child = new Child("Mike");
//        Parent anotherChild = new AnotherChild("Max");

//        parent.print();
//        child.print();
//        anotherChild.print();

//        Child child2 = new Child();
//
//        child2.

//        Child child1 = new Parent();  создание невозможно

//          ((Child) parent).print();  <- ClassCastException


//        Object object = new Object();
//        object.toString();
//        object.hashCode();
//        object.equals(new Object());

//        Car car = new Car();
//        car.setColor(Color.BLACK);
//        car.setBrand("LADA");
//        car.setModel("VESTA");
//
//        Car car2 = new Car();
//        car2.setColor(Color.WHITE);
//        car2.setBrand("LADA");
//        car2.setModel("VESTA");
//
//        System.out.println(car.equals(car2));

//        Movable car = new Car();
//        Movable bus = new Bus();

//        Movable movable = new Movable(); невозможно создать

//        printInfo(car);
//        printInfo(bus);

        Transport plane = new Plane(20000, 100, true);
        Transport bus = new Bus(5000, 30, false);

//        Transport transport = new Transport(); невозможно создать

        printInfo(plane);
        printInfo(bus);

    }

    public static void printInfo(Parent parent) {
        parent.print();
    }


    public static void printInfo(Movable transport) {
        transport.printTransportInfo();
    }


    public static void printInfo(Transport transport) {
        transport.printTransportInfo();
    }
}
