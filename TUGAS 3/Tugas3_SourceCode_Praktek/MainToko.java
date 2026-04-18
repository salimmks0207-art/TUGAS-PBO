import java.util.Scanner;

public class MainToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TokoBuah[] katalog = new TokoBuah[3];
        katalog[0] = new TokoBuah("Apel",   15000, 10);
        katalog[1] = new TokoBuah("Jeruk",  12000, 8);
        katalog[2] = new TokoBuah("Mangga", 20000, 5);

        // Tampilkan katalog
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + katalog[i].getInfo());
        }
        System.out.println();

        double total = 0.0;
        int pilih;

        while (true) {
            System.out.print("Pilih (0=stop): ");
            pilih = sc.nextInt();

            if (pilih == 0) break;

            System.out.print("Jumlah(kg): ");
            int qty = sc.nextInt();

            if (katalog[pilih - 1].tersedia(qty)) {
                double bayar = katalog[pilih - 1].hitungTotal(qty);
                total += bayar;
                System.out.println("OK +Rp" + (int) bayar);
            } else {
                System.out.println("Stok tidak cukup!");
            }
            System.out.println();
        }

        System.out.println("Total: Rp" + (int) total);
    }
}