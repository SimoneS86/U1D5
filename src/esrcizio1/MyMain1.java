package esrcizio1;

import java.util.Scanner;
import java.util.Random;

public class MyMain1 {

	public static void main(String[] args) {
		int[] array = new int[5];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }

        System.out.println("Array iniziale:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        int posizione;
        int valore;

        while (true) {
            System.out.print("Digita la posizione (0-1-2-3-4) in cui inserire il valore: ");
            posizione = input.nextInt();

            if (posizione < 0 || posizione > 4) {
                System.out.println("Posizione non valida");
                continue;
            } 

            System.out.print("Digita il valore da inserire (0 per uscire): ");
            valore = input.nextInt();

            if (valore < 1 || valore > 10) {
                System.out.println("Valore non valido");
                continue;
            }
            
            if (posizione == 0) {
                System.out.println("Programma terminato.");
                break;
            }

            array[posizione] = valore;
            System.out.println("Array aggiornato:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        input.close();
	}

}
