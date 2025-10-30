import java.util.Scanner;

public class NilaiKelompok16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        int totalNilai;
        float rataRata;

        float maxRataRata = 0;
        int kelompokTerbaik = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("nilai dari kelompok penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataRata = (float) totalNilai / 5;
            System.out.println("rata-rata nilai kelompok " + i + " : " + rataRata);

            if (rataRata > maxRataRata) {
                maxRataRata = rataRata;
                kelompokTerbaik = i;
            }

            i++;
        }

        System.out.println("Kelompok dengan rata-rata nilai tertinggi adalah: Kelompok " + kelompokTerbaik);
        System.out.println("Dengan nilai rata-rata: " + maxRataRata);

        sc.close();
    }
}