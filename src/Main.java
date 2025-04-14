import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
        }
            if (input.equals("x")) {
                play = false;
            }
            else if(input.equals("v")) {

        }

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
        Translator numericAlpha = new Translator(alphabetic, numeric);


    }


}

