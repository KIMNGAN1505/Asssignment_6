 
package Assignment6;
   import java.util.Random;
import java.util.Scanner;

public class exercise7 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int userGuess, tries = 0;

        System.out.println("Chao mung ban den voi tro choi doan So!");
        System.out.println("Toi da chon mot so tu 1 den 100. Hay doan xem!");

        do {
            System.out.print("doan so cua ban: ");
            userGuess = scanner.nextInt();
            tries++;

            if (userGuess > secretNumber) {
                System.out.println("So cua ban lon hon so bi mat.");
            } else if (userGuess < secretNumber) {
                System.out.println("So cua ban nho hon so bi mat.");
            } else {
                System.out.println("Chuc mung! Ban da doan dung so bi mat la " + secretNumber + " sau " + tries + " lan doan!");
            }
        } while (userGuess != secretNumber);

    }
}


