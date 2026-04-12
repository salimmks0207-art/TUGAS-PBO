// NIM   : 13020240076
// NAMA  : Muh. Syarif Hidayatullah
// Hari/Tanggal: Minggu, 09 April 2026. 18:22

import java.util.Scanner;

public class If1 {
	public static void main (String[] args){
	Scanner masukan= new Scanner(System.in);
	int a;

	System.out.print("Contoh IF satu kasus \n");
	System.out.print ("Ketikkan suatu nilai integer : "); 
	a = masukan.nextInt();
	if (a >= 0)
	System.out.print ("\nNilai a positif "+ a);
}
}