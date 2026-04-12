// NIM   : 13020240076
// NAMA  : Muh. Syarif Hidayatullah
// Hari/Tanggal: Minggu, 12 April 2026. 19:02

import java.util.Scanner;

public class PrintXinterasi {
	public static void main (String[] args) {
		int Sum=0;
		int x;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
	x = masukan.nextInt(); 
	if (x == 999){
	System.out.print ("Kasus kosong \n");	

	} else { Sum = x; /* Inisialisasi; invariant !! */

	for (;;){	
	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
	x = masukan.nextInt(); /* Next Elmt */
	if(x==999) 
	break;
	else{
	Sum = Sum + x; /* Proses */
	}
}
}
System.out.println("Hasil penjumlahan = "+ Sum);
}
}