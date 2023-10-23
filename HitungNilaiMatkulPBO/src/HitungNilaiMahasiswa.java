import java.util.Scanner;

public class HitungNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Nilai Tubes: ");
        double nilaiTubes = scanner.nextDouble();

        System.out.print("Nilai Quiz: ");
        double nilaiQuiz = scanner.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        double totalNilai = (0.3 * nilaiTubes) + (0.1 * nilaiQuiz) + (0.1 * nilaiTugas) + (0.25 * nilaiUTS)
                + (0.25 * nilaiUAS);

        System.out.println("\nNilai Matakuliah Pemrograman Berorientasi Objek:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Total Nilai Anda: " + totalNilai);
    }
}
