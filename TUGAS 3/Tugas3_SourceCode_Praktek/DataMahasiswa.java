import java.util.Scanner;

public class DataMahasiswa{
    private String nama;
    private String nim;
    private int jumlahMK;
    private int[] nilai;

    public DataMahasiswa(String nama, String nim, int jumlahMK) {
        this.nama = nama;
        this.nim = nim;
        this.jumlahMK = jumlahMK;
        this.nilai = new int[jumlahMK];
    }

    public void inputNilai(Scanner sc) {
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nilai MK-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    public double hitungRataRata() {
        int total = 0;
        for (int i = 0; i < jumlahMK; i++) {
            total += nilai[i];
        }
        return (double) total / jumlahMK;
    }

    public char tentukanGrade() {
        double avg = hitungRataRata();
        if (avg >= 85) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else return 'D';
    }

    public boolean lulus() {
        return hitungRataRata() >= 60.0;
    }

    public void tampilRapor() {
        System.out.println("\n=== RAPOR ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Nilai:");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("  MK-" + (i + 1) + " : " + nilai[i]);
        }
        System.out.printf("Rata  : %.2f%n", hitungRataRata());
        System.out.println("Grade : " + tentukanGrade());
        System.out.println("Lulus : " + lulus());
    }
}