// NIM   : 13020240076
// NAMA  : Muh. Syarif Hidayatullah
// Hari/Tanggal: Minggu, 12 April 2026. 18:10

import java.util.Scanner;

public class PrintRepeat {
	public static void main (String[] args){
		int N;
		int i;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Nilai N >0 = "); 
	N = masukan.nextInt();
	i = 1; 
		System.out.print ("Print i dengan REPEAT: \n"); 
	do{
	System.out.print (i+"\n"); /* Proses */
	i++; 
}
	while (i <= N); 
}
}