import java.util.Scanner;

public class tugas116 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai i = ");
        int i = sc.nextInt();
        
        for (int n = 1; n <= i; n++) {
            
            int jumlahKuadrat = 0; 
            String prosesPerhitungan = "";
            
            System.out.print("n = " + n + " -> jumlah kuadrat = ");
            
            for (int j = 1; j <= n; j++) {
                int kuadrat = j * j; 
                jumlahKuadrat += kuadrat;
                
                if (j == 1) {
                    prosesPerhitungan += kuadrat;
                } else {
                    prosesPerhitungan += " + " + kuadrat;
                }
            }
            System.out.println(prosesPerhitungan + " = " + jumlahKuadrat);
        }
    }
}