package lesson2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X5");
//        System.out.println(car.getBrand());

        car.setPrice(50000L);

//        System.out.println(car);

//        car.setPrice(70000L);
//        System.out.println(car);

        car.setColor(Color.BLACK);

//        System.out.println(car);


        System.out.println(car.getColor().getDescription());
        System.out.println(car.getColor().getCode());

        car = null;
    }
}
