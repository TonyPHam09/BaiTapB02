import java.util.Scanner;
import java.lang.Math;

public class cau4 {
     public static void main(String[] args) {
        int n,i,s,temp;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap mang: ");
        n = sc.nextInt();
        arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.printf("nhap phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for(s = i + 1; s < n; s++) {
                if(arr[i] > arr[s]) {
                    temp = arr[i];
                    arr[i] = arr[s];
                    arr[s] = temp;
                }
            }
            System.out.println("phan tu " + i + ": " + arr[i]);
        }
     }
}
