
package Assignment6;
    import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen duong N: ");
        int n = scanner.nextInt();

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tong cac so tu 1 den " + n + " la: " + sum);
    }
}

    

