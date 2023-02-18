import java.util.Scanner;

public class cau3 {
    public static void main(String[] args) {
        int n,gt;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap so nguyen: ");
        n = sc.nextInt();
        gt = 1;
        for(int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println("giai thua cua "+n+" se la: "+gt);
    }
}
