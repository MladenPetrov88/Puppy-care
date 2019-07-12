import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKGS = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int foodGrams = foodKGS * 1000;
        int totalEatFood = 0;
        while (!input.equals("Adopted")) {
            int foodEaten = Integer.parseInt(input);
            totalEatFood += foodEaten;

            input = scanner.nextLine();

        }
        if (foodGrams >= totalEatFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodGrams - totalEatFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", totalEatFood - foodGrams);
        }

    }
}