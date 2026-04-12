// NIM   : 13020240076
// NAMA  : Muh. Syarif Hidayatullah
// Hari/Tanggal: Minggu, 09 April 2026. 19:24

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
	int a;

	Scanner masukan=new Scanner(System.in);
	System.out.print("Contoh IF tiga kasus \n");
	a=masukan.nextInt();
	if (a > 0) {
	System.out.println("Nilai a positif " + a);
}	else if (a == 0) {
	System.out.println("Nilai nol " + a);
}	else
System.out.println("Nilai a negative "+ a);
}
}
