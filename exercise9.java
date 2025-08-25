
package Assignment6;
    import java.util.Scanner;

public class exercise9 {
 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int number;

        System.out.println("Nhap cac so de tinh trung binh cong (nhap 0 de dung).");

        while (true) {
            System.out.print("Nhap mot so: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("So luong so da nhap: " + count);
            System.out.println("Tong: " + sum);
            System.out.println("Trung binh cong la: " + average);
        } else {
            System.out.println("Ban chua nhap so nao de tinh trung binh.");
        }
     }
}


