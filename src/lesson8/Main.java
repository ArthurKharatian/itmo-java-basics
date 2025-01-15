package lesson8;

import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) {

        try {
            logger.info("OK");
            throwMyCheckedException();
        } catch (MyCheckedException | MyUncheckedException e) {

            System.err.println(e.getMessage());
        } catch (Exception ignored) {

        } finally {
            System.out.println("finally");
        }

        throwMyUncheckedException();
    }

    public static void throwMyCheckedException() throws MyCheckedException {
        //logic
        throw new MyCheckedException("some exception");
    }

    public static void throwMyUncheckedException() {
        //logic
        throw new MyUncheckedException("some exception");
    }
}
