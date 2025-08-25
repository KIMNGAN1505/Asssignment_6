
package Assignment6;
    import java.util.Scanner;

public class exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu cao h cua tam giac: ");
        int h = scanner.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


