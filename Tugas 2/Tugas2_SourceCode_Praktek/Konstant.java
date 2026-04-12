// NIM   : 13020240076
// NAMA  : Muh. Syarif Hidayatullah
// Hari/Tanggal: Minggu, 12 April 2026. 17:15

java.util.Scanner;

public class Konstant {
	public static void main(String[] args) {
	final float PHI = 3.1415f; 
	float r;
	Scanner masukan = new Scanner(System.in);

	r = masukan.nextFloat();
	System.out.print("Luas lingkaran = "+ (PHI * r * r)+"\n");
	System.out.print("Akhir program\n");
}
}