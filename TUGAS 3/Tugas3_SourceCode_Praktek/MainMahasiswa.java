import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Jml MK: ");
        int jumlahMK = sc.nextInt();

        DataMahasiswa mhs = new DataMahasiswa(nama, nim, jumlahMK);
        mhs.inputNilai(sc);
        mhs.tampilRapor();
    }
}