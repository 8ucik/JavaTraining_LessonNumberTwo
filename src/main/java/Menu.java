public class Menu {
    public static void Show() {
        System.out.println("\nPlease select one of the options available."
                + "\n1 - " + Generator.returnText("5")
                + "\n2 - " + Generator.returnText("10")
                + "\n3 - " + Generator.returnText("15")
                + "\n0 - Exit.");
    }
}
