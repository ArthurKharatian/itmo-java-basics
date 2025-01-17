package lesson9;

import lesson2.Car;
import lesson2.Color;
import lesson6.AnotherChild;
import lesson6.Child;
import lesson6.Parent;
import lesson9.generics.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List list = new ArrayList();
//
//        list.add(123);
//        list.add("String");
//        list.add(true);
//        list.add(new Car());

//        System.out.println(list);

//        var strings1 = new ArrayList<String>();

//        List<String> strings = new ArrayList<>();
//        strings.add("String");
//        strings.add("123");
//        strings.add("true");
//
//        System.out.println(strings);
//
//        Collections.sort(strings);
//        System.out.println(strings);

        List<Integer> ints = new ArrayList<>();

        ints.add(432);
        ints.add(11);
        ints.add(2);
        ints.add(3334);
        ints.add(113);
        ints.add(23);
        ints.add(4332);
        ints.add(4);
        ints.add(9);

//        ints.remove(Integer.valueOf(432));
//
//        System.out.println(ints);

//        for (int i = 0; i < ints.size(); i++) {
//            if (ints.get(i) == 3334) {
//                ints.remove(ints.get(i));
//            }
//        }

//        for (Integer integer : ints) { // ConcurrentModificationException
//            if (integer == 3334) {
//                ints.remove(integer);
//            }
//        }
//
//        System.out.println(ints);


//        Iterator<Integer> iterator = ints.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() == 3334) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(ints);

//        List<Integer> integers = Arrays.asList(123, 33, 131, 445); // Java 8
////        integers.add(123456); //UnsupportedOperationException
//
//        List<Integer> integers2 = List.of(123, 33, 131, 445); // Java 11
////        integers2.add(123456);
//
//        List<Integer> unmodifiableList = Collections.unmodifiableList(ints);

//        Parent parent = new Parent("John");
//        Parent child = new Child("Mike");
//        Parent anotherChild = new AnotherChild("Max");
//
//        printInfo(parent);
//        printInfo(child);
//        printInfo(anotherChild);
//
//        List<Parent> parents = new ArrayList<>();
//        List<Child> children = new ArrayList<>();
//        List<AnotherChild> anotherChildren = new ArrayList<>();
//
//        printInfo(parents);
//        printInfo(children);
//        printInfo(anotherChildren);
//
//
//        printInfo2(parents);
//        printInfo2(children);
////        printInfo2(anotherChildren);
//
//        process(parents);
//        process(children);
//        process(anotherChildren);
//        process(ints);
//
//        Animal<Meal, Plate, Toy> cat = new Cat();
//        cat.anotherMethod(new Meal(), new Plate(), new Toy());


//        Set<String> strings = new HashSet<>();
//        for (int i = 0; i < 100; i++) {
//            strings.add("Java");
//        }
//
//        strings.add("String");
//        strings.add("777");
//        strings.add("world!");
//        strings.add("Hello");
//
//        System.out.println(strings);

//        Set.of();

        //   key      value
        Map<String, Integer> map = new HashMap<>();

        map.put("John", 12313);
        map.put("Alice", 312);
        map.put("Katie", 12313);
        map.put("Bob", 1566);
        map.put("Mike", 99983);
//        map.put("Mike", 9998356);

//        System.out.println(map);
        Set<String> strings = map.keySet();
        Collection<Integer> values = map.values();

        Integer aliceNum = map.get("Alice");
//        System.out.println(aliceNum);
//
//        Integer alexNum = map.get("Alex");
//        System.out.println(alexNum);

//        Integer alexNum = map.getOrDefault("Alex", 0);
//        System.out.println(alexNum);

        Set<String> keysByValue = getKeysByValue(map, 12313);
//        System.out.println(keysByValue);

        Map<String, Integer> alex = Map.of("Alex", 123, "Bob", 123323);

        Map<String, Integer> stringIntegerMap = Map.ofEntries(
                Map.entry("Alex", 123),
                Map.entry("Bob", 123323)
        );

//       Map<Color, String> colorStringMap = new EnumMap<>(Color.class);

    }

    public static void printInfo(Parent parent) {
        parent.print();
    }

    public static void printInfo(List<? extends Parent> parents) {

    }

    public static void printInfo2(List<? super Child> parents) {

    }

    public static <T> void process(List<T> list) {
        for (T objects : list) {
            // TO DO
        }
    }

    public static Set<String> getKeysByValue(Map<String, Integer> map, Integer value) {
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String pairKey = pair.getKey();
            Integer pairValue = pair.getValue();
            if (value.equals(pairValue)) {
                result.add(pairKey);
            }
        }

        return result;
    }


}
