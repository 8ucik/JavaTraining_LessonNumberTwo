import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception {
        /*Zaimplementuj metodę Java - tokenGenerator().
                1. Liczba parametrów - dowolne
                2. Nazwa - tokenGenerator()
                3. Return - zwraca token
                4. token - to ciąg randomowych znaków [a-z][A-Z][0-9][!@#$%^&*()] - o dowolnej długości
                5.  Metoda generuje 3 różne wersje tokenów w zależności od potrzeby usera:
                5-znakowy, 10-znakowy oraz 15-znakowy

                Przykład tokena 5 znakowego - g4#2%
                Przykład tokena 10 znakowego - g4#2%hQQ5^
                Przykład tokena 15 znakowego - g4#2%hQQ5^YY5!2*/

            System.out.println("Please select one of the options available."
                    + "\n1 - " + tokenGenerator.returnText("5")
                    + "\n2 - " + tokenGenerator.returnText("10")
                    + "\n3 - " + tokenGenerator.returnText("15")
                    + "\n0 - Exit.");

            int selection = 0;
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                selection = input.nextInt();
            } else {
                System.out.println("Sorry. That is not a number.");
                return;
            }

            switch (selection) {

                case 0:
                    System.out.println("Bye.");
                    break;

                case 1:
                    System.out.println(tokenGenerator.returnText("5"));
                    System.out.println(tokenGenerator.getTokenBy(5));
                    break;

                case 2:
                    System.out.println(tokenGenerator.returnText("10"));
                    System.out.println(tokenGenerator.getTokenBy(10));
                    break;

                case 3:
                    System.out.println(tokenGenerator.returnText("15"));
                    System.out.println(tokenGenerator.getTokenBy(15));
                    break;

                default:
                    throw new IllegalStateException("Value unsupported by design. Sorry: "
                            + input
                            + " is not accepted.");
            }
    }
}
