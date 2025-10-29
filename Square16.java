import java.util.Scanner;

public class Square16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai N = ");
        int n = sc.nextInt();
        sc.close();

        for (int iOuter = 1; iOuter < n; iOuter++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
