// NIM   : 13020240076
// NAMA  : Muh. Syarif Hidayatullah
// Hari/Tanggal: Minggu, 5 April 2026. 18:33

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;       
import java.io.Console;         
import javax.swing.JOptionPane;  

public class Bacakar {
    public static void main(String[] args) throws IOException {
    
        char cc; 
        int bil;
        
     
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input BufferedReader (karakter): ");
        cc = dataIn.readLine().charAt(0);
        System.out.println("Hasil BufferedReader: " + cc);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Scanner (bilangan): ");
        bil = sc.nextInt();
        System.out.println("Hasil Scanner: " + bil);

        Console con = System.console();
        if (con != null) {
            System.out.print("Input Console (teks): ");
            String teks = con.readLine();
            System.out.println("Hasil Console: " + teks);
        }
        String inputDialog = JOptionPane.showInputDialog("Input JOptionPane (masukkan sesuatu):");
        JOptionPane.showMessageDialog(null, "Hasil JOptionPane: " + inputDialog);
        
	System.out.print (cc +" \n " +bil+" \n ");
        System.out.println("bye\n");
    }
}