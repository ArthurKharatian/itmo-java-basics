package lesson10;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        File file = new File("files/text.txt");
//        File file2 = new File("files/output.txt");

//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String input;
//
//            while ((input = reader.readLine()) != null) {
//                System.out.println(input);
//            }
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

//        InputStream is = null;
//        OutputStream os = null;
//
//        try {
//            is = new FileInputStream(file);
//            os = new FileOutputStream(file2);
//
//            while (is.available() > 0) {
//                os.write(is.read());
//            }
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        } finally {
//            try {
//                if (is != null) {
//                    is.close();
//
//                }
//                if (os != null) {
//                    os.close();
//                }
//
//            } catch (IOException e) {
//                System.err.println(e.getMessage());
//            }
//        }

//        writeData(List.of("Java", "programming", "language"), file, "files/modifiedText.tx");

        //apache POI

        //nio

        Path path = Paths.get("C:\\Users\\Артур\\Pictures");

//        File[] files = path.toFile().listFiles();
//        if (files != null) {
//            for (File f : files) {
//                System.out.println(f.getName());
//            }
//        }
//
//        double totalSpace = path.toFile().getTotalSpace() / 1_000_000_000.0;
//        String formattedInfo = new DecimalFormat("#.##").format(totalSpace);
//
//        System.out.println(formattedInfo + "GB");

        System.out.println(path.getFileSystem());

    }

    public static void writeData(List<String> strings, File file, String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {

            String input;

            while ((input = reader.readLine()) != null) {
                for (String string : strings) {
                    writer.write(string + input + "\n");
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
