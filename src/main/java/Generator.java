import java.util.Random;

public class Generator {
    private static final Random random = new Random();

    public static String getTokenBy(int size) {
        String allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"
                + "!@#$%^&*()/";

        StringBuilder stringBuilder = new StringBuilder(size);
        for (int c = 0; c < size; c++) {
            int index = (int) (allChars.length() * Math.random());
            stringBuilder.append(allChars.charAt(index));
        }

        return "The generated token of size " + size + " is: " + stringBuilder;
    }

    public static String getTokenFromAscii(int size) {
        int ascii = 127;

        StringBuilder stringBuilder = new StringBuilder(size);
        for (int c = 0; c < size; c++) {
            stringBuilder.append((char) random.nextInt(ascii));
        }

        return "The generated token of size " + size + " is: " + stringBuilder;
    }

    public static String returnText(String size) {
        return "Generate token with " + size + " characters.";
    }
}
