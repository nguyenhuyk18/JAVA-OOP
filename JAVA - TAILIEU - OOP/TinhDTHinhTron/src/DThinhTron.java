import java.util.Scanner;

public class DThinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r ;
        System.out.println("Nhập bán kính: ");
        r = sc.nextDouble();
        double dt = Math.PI * Math.pow(r,2);
        System.out.println("Diện tích hình tròn: "+dt);
    }
}
