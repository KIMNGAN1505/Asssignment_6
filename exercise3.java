
package Assignment6;
    import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        int height = scanner.nextInt();
        System.out.print("Nhap chieu rong: ");
        int width = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


