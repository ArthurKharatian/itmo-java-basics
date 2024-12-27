package lesson5;

import lesson2.Car;

public class Main {
    public static void main(String[] args) {
        String java = "Java";

//        String java2 = new String("JaVa");

//        System.out.println(java == java2);
//        System.out.println(java.equals(java2));
//        System.out.println(java.equalsIgnoreCase(java2));

//        String s = java.concat(" Developer");
//        java = java.concat(" Developer");

//        System.out.println(java);


        java = java + 123;
//
//        System.out.println(java);

//        java = 80 + 120 + java + (140 + 160);
//        System.out.println(java);

//        char[] chars = java.toCharArray();
//        for (char aChar : chars) {
//            if (Character.isDigit(aChar)) {
//                System.out.println(aChar);
//            }
//        }

//        int length = java.length();

//        System.out.println(length);

//        String str = null;
//        String emptyStr = "";
//
//        if (str != null && !str.isEmpty()) {
//            //logic
//        }


//        String s = " asdasda dsdad dasds123    \n ";
//        System.out.println(s);
//        s = s.trim();
//        System.out.println(s);


//        String substring = java.substring(3);
//        String substring2 = java.substring(3, 5);
//
//        System.out.println(java);
//        System.out.println(substring);
//        System.out.println(substring2);


//        String string = "Hello world1234115151!";

//        String replace = string.replace("1", "?");
//        String replace = string.replaceAll("[^0-9]", "*");


//        System.out.println(replace);

        String text = "Что такое Lorem Ipsum?\n" +
                "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.";

//        String[] strings = text.split(" ");
//        for (String s : strings) {
//            System.out.println(s);
//        }

//        int i = Integer.parseInt("123");
//
////        Car car = null;
//
////        String nullValue = String.valueOf(car);
//        String num = String.valueOf(i);
//
////        System.out.println(nullValue);
//        System.out.println(num);

        StringBuilder builder = new StringBuilder(java);
//        StringBuilder builder2 = new StringBuilder(java);

//        System.out.println(builder);

//        System.out.println(java == builder.toString());
//        System.out.println(builder == builder2);
//        System.out.println(builder.equals(builder2));
//        System.out.println(java.equals(builder2.toString()));
//        System.out.println(java.equals(builder2));



//        for (String word : text.split(" ")) {
//            builder.append(word).append(", ");
//        }
//
//        System.out.println(builder);


//        System.out.println(builder.reverse());


//        builder.insert(43, "St.-Petersburg");

//        System.out.println(builder);

        StringBuffer buffer = new StringBuffer(java);

    }
}
