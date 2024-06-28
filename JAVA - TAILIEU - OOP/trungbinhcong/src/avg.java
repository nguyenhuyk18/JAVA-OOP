import java.util.Scanner;

public class avg {
    //tính trung bình cộng của một mảng số nguyên dương nhập từ bàn phím
    public static void main(String [] args  ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        System.out.println("Trung bình cộng của mảng là: " + (double)sum/n);

    }
}
