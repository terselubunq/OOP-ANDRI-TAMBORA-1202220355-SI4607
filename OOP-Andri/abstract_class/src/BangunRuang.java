// Class Abstract BangunRuang
abstract class BangunRuang {
    // Method Abstract
    abstract double luasAlas(double dimensi1, double dimensi2);

    abstract double kelilingAlas(double dimensi1, double dimensi2);

    abstract double volume(double dimensi1, double dimensi2, double dimensi3);

    abstract double luasPermukaan(double dimensi1, double dimensi2, double dimensi3);

    // Metode baru untuk overriding
    abstract String deskripsi();
}

// Class Hitung sebagai implementasi dari BangunRuang
class Hitung extends BangunRuang {
    private double dimensi1;
    private double dimensi2;
    private double dimensi3;

    // Konstruktor
    Hitung(double dimensi1, double dimensi2, double dimensi3) {
        this.dimensi1 = dimensi1;
        this.dimensi2 = dimensi2;
        this.dimensi3 = dimensi3;
    }

    // Implementasi dari Method Abstract
    @Override
    double luasAlas(double dimensi1, double dimensi2) {
        return this.dimensi1 * this.dimensi2; // Menggunakan variabel instan dimensi1 dan dimensi2
    }

    @Override
    double kelilingAlas(double dimensi1, double dimensi2) {
        return 2 * (this.dimensi1 + this.dimensi2); // Menggunakan variabel instan dimensi1 dan dimensi2
    }

    @Override
    double volume(double dimensi1, double dimensi2, double dimensi3) {
        return this.dimensi1 * this.dimensi2 * this.dimensi3;
        // Menggunakan variabel instan dimensi1, dimensi2, dan dimensi3
    }

    @Override
    double luasPermukaan(double dimensi1, double dimensi2, double dimensi3) {
        return 2 * (luasAlas(this.dimensi1, this.dimensi2)
                + kelilingAlas(this.dimensi1, this.dimensi2) * this.dimensi3);
        // Menggunakan variabel instan dimensi1, dimensi2, dan dimensi3
    }

    // Metode Overloading untuk menghitung luas alas persegi
    double luasAlas(double sisi) {
        return sisi * sisi;
    }

    // Metode Overloading untuk menghitung keliling alas persegi
    double kelilingAlas(double sisi) {
        return 4 * sisi;
    }

    // Implementasi Overriding dari metode deskripsi
    @Override
    public String deskripsi() {
        return "Ini adalah bangun ruang abstrak dengan dimensi1: " + dimensi1 +
                ", dimensi2: " + dimensi2 +
                ", dimensi3: " + dimensi3 + ".";
    }
}
