import java.util.Scanner;

public class BacaData {

	//NIM	: 13020240076
	//NAMA	: Muh. Syarif Hidayatullah
	//Minggu/05-04-2026. 17:45

	public static void main (String[] args) {
	int a;
	Scanner masukan;	

	System.out.print("Contoh membaca dan menulis, ketik integer: \n");
	masukan = new Scanner(System.in);
	a = masukan.nextInt();
	masukan.nextInt();

	System.out.print("Nilai yang dibaca : " + a);
}
}	