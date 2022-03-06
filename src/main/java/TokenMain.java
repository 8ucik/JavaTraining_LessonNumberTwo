import java.util.Scanner;

public class TokenMain {
    public static void main(String[] args) {
        int selection;
        Scanner input = new Scanner(System.in);
        Menu.Show();

        if (!input.hasNextInt()) {
            System.out.println("Sorry. That is not a number.");
            return;
        }

        selection = input.nextInt();
        switch (selection) {
            case 0:
                System.out.println("Bye Bye.");
                break;

            case 1:
                System.out.println(Generator.returnText("5")
                        + "\n"
                        + Generator.getTokenFromAscii(5));
                break;

            case 2:
                System.out.println(Generator.returnText("10")
                        + "\n"
                        + Generator.getTokenFromAscii(10));
                break;

            case 3:
                System.out.println(Generator.returnText("15")
                        + "\n"
                        + Generator.getTokenFromAscii(15));
                break;

            default:
                System.out.println("The entered value ("
                        + selection
                        + ") is unsupported by design. Please try again.");
        }
    }
}

