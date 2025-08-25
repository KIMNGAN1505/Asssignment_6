
package Assignment6;
    import java.util.Scanner;

public class exercise8 {
 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Nhap mot so tu 1 den 10: ");
            number = scanner.nextInt();
            if (number < 1 || number > 10) {
                System.out.println("So khong hop le, vui long nhap lai.");
            }
        } while (number < 1 || number > 10);

        System.out.println("Ban da nhap so hop le: " + number);
    }
}


