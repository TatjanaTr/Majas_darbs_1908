import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] elements = {"Akmens", "Šķēres", "Papīrīts"};

        while (true) {
            System.out.println("Ievadi savu izvēli: Akmens, Šķēres vai Papīrīts");
            String result = elements[new Random().nextInt(elements.length)];
            String userChoise = scan.nextLine();
            System.out.println("Datora izvēle ir: " + result);

            if (userChoise.equals(result)) {
                System.out.println("Neizskirts");
            } else if (userChoise.equals("Akmens") && result.equals("Šķēres")) {
                System.out.println("Tu uzvareji");
            } else if (userChoise.equals("Akmens") && result.equals("Papīrīts")) {
                System.out.println("Tu zaudeji");
                break;
            } else if (userChoise.equals("Papīrīts") && result.equals("Akmens")) {
                System.out.println("Tu uzvareji");
            } else if (userChoise.equals("Papīrīts") && result.equals("Šķēres")) {
                System.out.println("Tu zaudeji");
                break;
            } else if (userChoise.equals("Šķēres") && result.equals("Papīrīts")) {
                System.out.println("Tu uzvareji");
            } else if (userChoise.equals("Šķēres") && result.equals("Akmens")) {
                    System.out.println("Tu zaudēji");
                    break;
            } else {
                System.out.println("KĻŪDA!!! Jānorāda Akmens, Šķēres vai Papīrīts");
            }
        }
    }
}