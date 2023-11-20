
abstract class Polymorphism {
    abstract double hitungKeliling();

    abstract double hitungLuas();
}

class Lingkaran extends Polymorphism {
    private double jariJari;
    private final double pi = 3.14159265358979323846;

    public Lingkaran(double diameter) {
        this.jariJari = 0.5 * diameter;
    }

    @Override
    public double hitungKeliling() {
        return 2 * pi * jariJari;
    }

    @Override
    public double hitungLuas() {
        return pi * Math.pow(jariJari, 2);
    }
}

class SegitigaSamaSisi extends Polymorphism {
    private double sisi;

    public SegitigaSamaSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return sisi * 3;
    }

    @Override
    public double hitungLuas() {
        return (Math.pow(sisi, 2) / 4) * (Math.sqrt(3));
    }
}

class Persegi extends Polymorphism {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungKeliling() {
        return sisi * 4;
    }

    @Override
    double hitungLuas() {
        return Math.pow(sisi, 2);
    }
}
