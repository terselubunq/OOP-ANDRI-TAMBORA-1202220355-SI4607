import java.util.Scanner;

// Class Abstract AlasPersegiPanjang
abstract class AlasPersegiPanjang {
    // Method Abstract
    abstract double luasAlas(double panjang, double lebar);

    abstract double kelilingAlas(double panjang, double lebar);

    abstract double volume(double panjang, double lebar, double tinggi);

    abstract double luasPermukaan(double panjang, double lebar, double tinggi);
}

// Class Hitung sebagai implementasi dari AlasPersegiPanjang
class Hitung extends AlasPersegiPanjang {
    private double panjang;
    private double lebar;
    private double tinggi;

    // Konstruktor
    Hitung(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Implementasi dari Method Abstract
    @Override
    double luasAlas(double panjang, double lebar) {
        return this.panjang * this.lebar; // Menggunakan variabel instan panjang dan lebar
    }

    @Override
    double kelilingAlas(double panjang, double lebar) {
        return 2 * (this.panjang + this.lebar); // Menggunakan variabel instan panjang dan lebar
    }

    @Override
    double volume(double panjang, double lebar, double tinggi) {
        return this.panjang * this.lebar * this.tinggi; // Menggunakan variabel instan panjang, lebar, dan tinggi
    }

    @Override
    double luasPermukaan(double panjang, double lebar, double tinggi) {
        return 2 * (luasAlas(this.panjang, this.lebar) + kelilingAlas(this.panjang, this.lebar) * this.tinggi);
        // Menggunakan variabel instan panjang,lebar,dan tinggi
    }
}

// Class abstract_class sebagai Main Class
public class abstract_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan panjang: ");
            double panjang = scanner.nextDouble();

            System.out.print("Masukkan lebar: ");
            double lebar = scanner.nextDouble();

            System.out.print("Masukkan tinggi: ");
            double tinggi = scanner.nextDouble();

            // Membuat objek dari class Hitung
            Hitung hitung = new Hitung(panjang, lebar, tinggi);

            // Menampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Cari Luas Alas");
            System.out.println("2. Cari Keliling Alas");
            System.out.println("3. Cari Volume Balok");
            System.out.println("4. Cari Luas Permukaan Balok");

            System.out.print("Pilih menu (1-4): ");
            int pilihan = scanner.nextInt();

            // Menentukan pilihan menu
            switch (pilihan) {
                case 1:
                    System.out.println("Luas Alas: " + hitung.luasAlas(panjang, lebar));
                    break;
                case 2:
                    System.out.println("Keliling Alas: " + hitung.kelilingAlas(panjang, lebar));
                    break;
                case 3:
                    System.out.println("Volume Balok: " + hitung.volume(panjang, lebar, tinggi));
                    break;
                case 4:
                    System.out.println("Luas Permukaan Balok: " + hitung.luasPermukaan(panjang, lebar, tinggi));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan angka.");
        } finally {
            scanner.close();
        }
    }
}
