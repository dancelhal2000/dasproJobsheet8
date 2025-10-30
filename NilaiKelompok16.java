import java.util.Scanner;

public class NilaiKelompok16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        float totalNilai;
        float rataRata;

        int i = 1;
        while (i <= 6) {
            System.out.println("kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("nilai dari kelompok penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataRata = totalNilai / 5;
            System.out.println("\nrata-rata nilai kelompok " + i + " : " + rataRata);
            i++;
        }
        sc.close();
    }
}
