import java.util.Scanner;

public class MainKonversi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        long totalDetik = sc.nextLong();

        KonversiWaktu kw = new KonversiWaktu(totalDetik);
        kw.tampilHasil();
    }
}