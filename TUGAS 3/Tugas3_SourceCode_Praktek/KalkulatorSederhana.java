package kalkulatorsederhana;

public class KalkulatorSederhana{
    private double angka1;
    private double angka2;
    private char operator;

    public KalkulatorSederhana(double angka1, double angka2, char operator) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;
    }

    public double tambah() {
        return angka1 + angka2;
    }

    public double kurang() {
        return angka1 - angka2;
    }

    public double kali() {
        return angka1 * angka2;
    }

    public double bagi() {
        return angka1 / angka2;
    }
}