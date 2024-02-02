package myshkevich.resources;

public class Wait {
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
        }
    }
}
