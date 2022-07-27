import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Nhập số hàng");
        n = sc.nextInt();
        System.out.println("Nhập sô cột");
        m = sc.nextInt();
        int arr [][] = new int[n][m];
        System.out.println("Nhập các phần tử");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Arr: " + i + " : " + j + " : ");
                arr[i][j] = sc.nextInt();

            }

        }
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}
