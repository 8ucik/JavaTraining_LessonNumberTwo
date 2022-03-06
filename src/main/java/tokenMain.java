import java.util.Scanner;

public class tokenMain {
    public static void main (String[] args) {
            System.out.println("Please select one of the options available."
                    + "\n1 - " + generator.returnText("5")
                    + "\n2 - " + generator.returnText("10")
                    + "\n3 - " + generator.returnText("15")
                    + "\n0 - Exit.");

            int selection;
            Scanner input = new Scanner(System.in);
            if (!input.hasNextInt()) {
                System.out.println("Sorry. That is not a number.");
                return;
            }
            selection = input.nextInt();

        switch (selection)
        {
            case 0:
                System.out.println("Bye Bye.");
                break;

            case 1:
                System.out.println(generator.returnText("5")
                        + "\n"
                        + generator.getTokenBy(5));
                break;

            case 2:
                System.out.println(generator.returnText("10")
                        + "\n"
                        + generator.getTokenBy(10));
                break;

            case 3:
                System.out.println(generator.returnText("15")
                        + "\n"
                        + generator.getTokenBy(15));
                break;

            default:
                System.out.println("The entered value ("
                        + input
                        + ") is unsupported by design.");
                break;
        }
    }
}
