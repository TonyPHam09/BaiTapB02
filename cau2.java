import java.util.Scanner;
import java.lang.Math;

public class cau2 {
    public static void main(String[] args) {
        float t,v,a,dtb;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap diem toan: ");
        t = sc.nextFloat();
        System.out.printf("nhap diem ngu van: ");
        v = sc.nextFloat();
        System.out.printf("nhap diem anh van: ");
        a = sc.nextFloat();
        dtb = (t*2 + v + a)/4;
        if(dtb < 5) {
            System.out.println("ket qua: " + dtb);
            System.out.println("hoc luc kem");
        }
        else {
            if(dtb >= 5 && dtb < 7) {
                System.out.println("ket qua: " + dtb);
                System.out.println("hoc luc trung binh");
            }
            else {
                if(dtb >= 7 && dtb < 8) {
                    System.out.println("ket qua: " + dtb);
                    System.out.println("hoc luc kha");
                }
                else {
                        System.out.println("ket qua: " + dtb);
                        System.out.println("hoc luc gioi");
                    }
                }
            }      
    }
}
