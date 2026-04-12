// NIM   : 13020240076
// NAMA  : Muh. Syarif Hidayatullah
// Hari/Tanggal: Minggu, 12 April 2026. 17:55

import java.util.Scanner;

public class PrintIterasi {
	public static void main (String[] args) {
	int N;
int i;
Scanner masukan=new Scanner(System.in);

System.out.print ("Nilai N >0 = "); 
N = masukan.nextInt();
i = 1; 
System.out.print ("Print i dengan ITERATE : \n"); 
for (;;){
System.out.println(i); 
if (i == N)  break;
else { 
i++; 
} 
} 
}
}