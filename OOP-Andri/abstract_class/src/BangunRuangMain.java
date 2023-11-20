import java.util.Scanner;

public class BangunRuangMain {
    // Class BangunRuangMain sebagai Main Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan dimensi pertama: ");
            double dimensi1 = scanner.nextDouble();

            System.out.print("Masukkan dimensi kedua: ");
            double dimensi2 = scanner.nextDouble();

            System.out.print("Masukkan dimensi ketiga: ");
            double dimensi3 = scanner.nextDouble();

            // Membuat objek dari class Hitung
            Hitung hitung = new Hitung(dimensi1, dimensi2, dimensi3);

            // Menampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Cari Luas Alas");
            System.out.println("2. Cari Keliling Alas");
            System.out.println("3. Cari Volume Bangun Ruang");
            System.out.println("4. Cari Luas Permukaan Bangun Ruang");
            System.out.println("5. Deskripsi Bangun Ruang");

            int pilihan; // Memindahkan deklarasi variabel pilihan ke luar blok switch-case

            try {
                System.out.print("Pilih menu (1-5): ");
                pilihan = scanner.nextInt();

                // Menentukan pilihan menu
                switch (pilihan) {
                    case 1:
                        System.out.println("Luas Alas: " + hitung.luasAlas(dimensi1, dimensi2));
                        break;
                    case 2:
                        System.out.println("Keliling Alas: " + hitung.kelilingAlas(dimensi1, dimensi2));
                        break;
                    case 3:
                        System.out.println("Volume Bangun Ruang: " + hitung.volume(dimensi1, dimensi2, dimensi3));
                        break;
                    case 4:
                        System.out.println(
                                "Luas Permukaan Bangun Ruang: " + hitung.luasPermukaan(dimensi1, dimensi2, dimensi3));
                        break;
                    case 5:
                        System.out.println("Deskripsi: " + hitung.deskripsi());
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Pastikan Anda memasukkan angka.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan angka.");
        } finally {
            scanner.close();
        }
    }
}
