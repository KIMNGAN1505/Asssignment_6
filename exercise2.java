
package Assignment6;
    import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so tu 2 den 9 de in bang cuu chuong: ");
        int number = scanner.nextInt();

        System.out.println("Bang cuu chuong " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}


