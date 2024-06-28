import java.util.Scanner;

public class tinhtong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n;i++) {
            sum += i;
        }
        System.out.println("Tổng từ 1 tới "+n+" là: "+sum);
    }
}
