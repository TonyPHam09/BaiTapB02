import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
                                                                        /*hello world*/
        // Scanner sc = new Scanner(System.in);
        // System.out.printf(" nhap a:");
        // int a = sc.nextInt();
        // System.out.printf(" nhap b:");
        // int b = sc.nextInt();
        // if ( a > b ){
        // System.out.println(a+b);
        // }
        // else {
        // System.out.printf(" tong:" + (a + b));
        // }
                                                                        /*tìm tổng*/
            // System.out.println("nhap a: ");
            // int a = sc.nextInt();
            // System.out.println("nhap b: ");
            // int b = sc.nextInt();
            // if(a > b) {
            // System.out.printfln("tong a va b la: " + (a+b));
            // }
            // else {
            // System.out.println("sai dieu kien");
            // }
                                                                        /*hàm if_else */
        // int a , b;
        // Scanner sc = new Scanner(System.in);
        // do {
        //     System.out.println("nhap a:");
        //     a = sc.nextInt();
        //     System.out.println("nhap b:");
        //     b = sc.nextInt();
        //     if( a < 0 || b <0)
        //     {
        //         System.out.println("nhap lai");
        //     }
        //     else{
        //         System.out.println("x = " + (a + b));
        //     }
        // } while( a < 0 || b < 0);
                                                                        /* hàm do_while */
        // int a;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("nhap a: ");
        // a = sc.nextInt();
        // switch (a) {
        //     case 1:
        //     System.out.println("du lieu duoc nhap la: " + a);
        //     break;
        //     default:
        //     System.out.println("so con lai");
        // }
                                                                        /*hàm switch case*/
        // float a, b;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("nhap a: ");
        // a = sc.nextFloat();
        // System.out.print("nhap b: ");
        // b = sc.nextFloat();
        // if(a==0){
        //     if(b==0){
        //         System.out.println("vo so nghiem");
        //     }
        //     else{
        //         System.out.println("thong bao vo nghiem");
        //     }
        // }
        // else{
        //     System.out.println("nghiem la: " + (-b / a));
        // } 
                                                                        /*bài 1*/
        // float a,b,c,d,x1,x2;
        // Scanner sc = new Scanner(System.in);
        // System.out.printf("nhap a:");
        // a = sc.nextFloat();
        // System.out.printf("nhap b:");
        // b = sc.nextFloat();
        // System.out.printf("nhap c:");
        // c = sc.nextFloat();
        // if( a == 0) {
        //     if ( b == 0 ) {
        //     System.out.println("vo so nghiem");
        //     }
        //     else {
        //         System.out.println("vo nghiem");
        //     }
        //     System.out.println("phuong trinh bac nhat: " + (-c/b));
        // }
        // else {
        //     d = b*b - 4*a*c;
        //     if(d<0) { 
        //         System.out.println("ket qua = " + d + "(vo nghiem)");
        //     }
        //     else {
        //         if(d==0) {
        //             System.out.println("co nghiem kep x = " + (-b/2*a));
        //         }
        //         else {
        //             if(d>0) {
        //                 x1 = (float) ((-b + Math.sqrt(d)) / (2*a));
        //                 x2 = (float) ((-b - Math.sqrt(d)) / (2*a));
        //                 System.out.println("phuong trinh co 2 nghiem phan biet: " + "x1 = " + x1 + "x2 = " + x2);
        //             }
        //         }
        //     }
        // }
                                                                            /*bài 2*/
        // int sd,t;
        // Scanner sc = new Scanner(System.in);
        // System.out.printf("nhap so dien trong thang: ");
        // sd = sc.nextInt();
        // if(sd<=50) {
        //     t = sd * 1000;
        //     System.out.printf("tien dien trong thang la: " + t);
        // }
        // else {
        //     if(sd>50) {
        //         t = 50 * 1000 + (sd - 50)*1200;
        //         System.out.printf("tien dien trong thang la: " + t);
        //     }
        // }
                                                                            /*bài 3*/
        // System.out.println("+------------------------------+");
        // System.out.println("1. Giai phuong trinh bac nhat");/*case 1 */
        // System.out.println("2. Giai phuong trinh bac hai");/*case 2 */
        // System.out.println("3. Tinh tien dien");/*case 3 */
        // System.out.println("4. Ket thuc ");/*end */
        // System.out.println("+------------------------------+");
        // int nhap;
        // Scanner scanner = new Scanner(System.in);
        // System.out.printf("Nhap lua chon: ");
        // nhap = scanner.nextInt();
        // switch (nhap) {
        //     case 1:
        //     float a , b;
        //     Scanner sc1 = new Scanner(System.in);
        //     System.out.print("Nhap a: ");
        //     a = sc1.nextFloat();
        //     System.out.print("Nhap b: ");
        //     b = sc1.nextFloat();
        //     if(a==0){
        //         if(b==0){
        //             System.out.println("Thong bao vo so nghiem");
        //         }
        //         else{
        //             System.out.println("Thong bao vo nghiem");
        //         }
        //     }
        //     else{
        //         System.out.println("Phuong trinh co nghiem la: " + (-b / a));
        //     }
        //     break;
        //     case 2:
        //     float x,y,z,d,x1,x2;
        //     Scanner sc2 = new Scanner(System.in);
        //     System.out.printf("Nhap a:");
        //     x = sc2.nextFloat();
        //     System.out.printf("Nhap b:");
        //     y = sc2.nextFloat();
        //     System.out.printf("Nhap c:");
        //     z = sc2.nextFloat();
        //     if( x == 0) {
        //         if ( y == 0 ) {
        //         System.out.println("Phuong trinh vo so nghiem");
        //         }
        //         else {
        //             System.out.println("Phuong trinh vo nghiem");
        //         }
        //         System.out.println("Phuong trinh bac nhat co nghiem la: " + (-z/y));
        //     }
        //     else {
        //         d = y*y - 4*x*z;
        //         if(d<0) { 
        //             System.out.println("Phuong trinh vo nghiem x = " + d);
        //         }
        //         else {
        //             if(d==0) {
        //                 System.out.println("Phuong trinh co nghiem kep x = " + (-y/2*x));
        //             }
        //             else {
        //                 if(d>0) {
        //                     x1 = (float) ((-y + Math.sqrt(d)) / (2*x));
        //                     x2 = (float) ((-y - Math.sqrt(d)) / (2*x));
        //                     System.out.println("Phuong trinh co 2 nghiem phan biet => " + "x1 = " + x1 + " x2 = " + x2);
        //                 }
        //             }
        //         }
        //     }
        //     break;
        //     case 3:
        //     int sd,t;
        //     Scanner sc3 = new Scanner(System.in);
        //     System.out.printf("Nhap so dien trong thang: ");
        //     sd = sc3.nextInt();
        //     if(sd<=50) {
        //         t = sd * 1000;
        //         System.out.printf("Tien dien trong thang la: " + t);
        //     }
        //     else {
        //         if(sd>50) {
        //             t = 50 * 1000 + (sd - 50)*1200;
        //             System.out.printf("Tien dien trong thang la: " + t);
        //         }
        //     }
        //     break;
        //     default:
        //     System.exit(0);
        // }
                                                                            /*bài 4*/
    }
}
