
package Assignment6;
    import java.util.Scanner;

public class exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen khong am N: ");
        int n = scanner.nextInt();

        long factorial = 1;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Giai thua cua " + n + " la: " + factorial);
        } else {
            System.out.println("Khong the tinh giai thua cho so am.");
        }
    }
}

