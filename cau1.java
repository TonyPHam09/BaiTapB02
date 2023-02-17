import java.util.Scanner;
import java.lang.Math;

public class cau1 {
    public static boolean checkPerfectSquare(Integer n) /*dữ kiện quan trọng để tính sqrt*/
    {                                                  //
        double sqrt;                                   //
        sqrt = Math.sqrt(n);                           //*phần này để kiểm tra số nguyên khi thực hiên căn bậc 2*/
        return ((sqrt - Math.floor(sqrt)) == 0);       //
    }                                                  /*xét căn bậc không cần bước giải*/
    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap du lieu: ");
        n = scanner.nextInt();
        if (checkPerfectSquare(n)) {
            System.out.println(n + " la so chinh phuong");
        }
        else {
            System.out.println(n + " khong phai la so chinh phuong");
        }
    }
}
