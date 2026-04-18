package kalkulatorsederhana;

import kalkulatorsederhana.KalkulatorSederhana;
import java.util.Scanner;

public class MainKalkulator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lagi;

        do {
            System.out.print("Angka 1 : ");
            double angka1 = sc.nextDouble();

            System.out.print("Angka 2 : ");
            double angka2 = sc.nextDouble();

            System.out.print("Operator : ");
            char operator = sc.next().charAt(0);

            KalkulatorSederhana k = new KalkulatorSederhana(angka1, angka2, operator);
            double hasil = 0;

            switch (operator) {
                case '+':
                    hasil = k.tambah();
                    break;
                case '-':
                    hasil = k.kurang();
                    break;
                case '*':
                    hasil = k.kali();
                    break;
                case '/':
                    if (angka2 == 0) {
                        System.out.println("Error: pembagian dengan nol!");
                    } else {
                        hasil = k.bagi();
                    }
                    break;
                default:
                    System.out.println("Operator tidak dikenal");
            }

            System.out.printf("Hasil: %.2f %c %.2f = %.2f%n", angka1, operator, angka2, hasil);

            System.out.print("Hitung lagi? (y/n): ");
            lagi = sc.next().charAt(0);
            System.out.println();

        } while (lagi == 'y');

        System.out.println("Program selesai.");
    }
}