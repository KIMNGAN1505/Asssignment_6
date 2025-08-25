
package Assignment6;
    import java.util.Scanner;

public class exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen duong: ");
        int number = scanner.nextInt();
        int originalNumber = number;

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Tong cac chu so cua " + originalNumber + " la: " + sum);
    }
}


