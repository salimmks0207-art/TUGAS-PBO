import java.util.Scanner;

public class KonversiWaktu {
    private long totalDetik;
    private long detikSekarang;
    private long totalMenit;
    private long menitSekarang;
    private long totalJam;
    private long jamSekarang;

    public KonversiWaktu(long totalDetik) {
        this.totalDetik    = totalDetik;
        this.detikSekarang = totalDetik % 60;
        this.totalMenit    = totalDetik / 60;
        this.menitSekarang = totalMenit % 60;
        this.totalJam      = totalMenit / 60;
        this.jamSekarang   = totalJam % 24;
    }

    public void tampilHasil() {
        System.out.println("Total detik: " + totalDetik);
        System.out.println("================");
        System.out.printf("Waktu: %02d:%02d:%02d%n", jamSekarang, menitSekarang, detikSekarang);
        System.out.println("================");
        System.out.println();
        System.out.println("Total Detik  : " + totalDetik);
        System.out.println("detikSaat ini : " + detikSekarang);
        System.out.println("menitSaat ini : " + menitSekarang);
        System.out.println("jamSaat ini   : " + jamSekarang);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        long totalDetik = sc.nextLong();

        KonversiWaktu kw = new KonversiWaktu(totalDetik);
        kw.tampilHasil();
    }
}