public class PolymorphismMain {
    public static void main(String[] args) {
        // Instance objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("Lingkaran:");
        System.out.println("Keliling: " + lingkaran.hitungKeliling());
        System.out.println("Luas: " + lingkaran.hitungLuas());

        // Instance objek SegitigaSamaSisi
        SegitigaSamaSisi segitiga = new SegitigaSamaSisi(5);
        System.out.println("\nSegitiga Sama Sisi:");
        System.out.println("Keliling: " + segitiga.hitungKeliling());
        System.out.println("Luas: " + segitiga.hitungLuas());

        // Instance objek Persegi
        Persegi persegi = new Persegi(4);
        System.out.println("\nPersegi:");
        System.out.println("Keliling: " + persegi.hitungKeliling());
        System.out.println("Luas: " + persegi.hitungLuas());
    }
}
