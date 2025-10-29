import java.util.Scanner;

public class Triangle16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai N = ");
        int n = sc.nextInt();
        int i = 0;
        sc.close();
        while (i < n) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}
