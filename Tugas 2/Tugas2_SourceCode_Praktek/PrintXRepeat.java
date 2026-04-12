// NIM   : 13020240076
// NAMA  : Muh. Syarif Hidayatullah
// Hari/Tanggal: Minggu, 12 April 2026. 19:27

import java.util.Scanner;

public class PrintXRepeat {
	public static void main (String[] args) {
	int Sum;
	int x;

	Scanner masukan=new Scanner(System.in);

	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
	x = masukan.nextInt(); /* First Elmt */
	if (x == 999){
	System.out.print("Kasus kosong \n");
} else { 
Sum = 0; 
   do{
	Sum = Sum + x; 
	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
	x = masukan.nextInt(); 
   } while (x != 999);
	System.out.println ("Hasil penjumlahan = "+Sum);
		}
	}
}