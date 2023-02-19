import java.util.Scanner;
import java.lang.Math;

public class cau1 {
    public static boolean checkPerfectSquare(int n)
    {                                                  
        double sqrt;                                   
        sqrt = Math.sqrt(n);                           
        return ((sqrt - Math.floor(sqrt)) == 0);       
    }                                                  
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
