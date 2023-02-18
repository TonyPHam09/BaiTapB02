import java.util.Scanner;

public class cau4 {
     public static void main(String[] args) {
        int n,i;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng: ");
        n = scanner.nextInt();
        arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + i + ": " + arr[i]);
        }
     }
}
