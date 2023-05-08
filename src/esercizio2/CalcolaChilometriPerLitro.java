package esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcolaChilometriPerLitro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Inserisci il numero di chilometri percorsi: ");
            double chilometriPercorsi = input.nextDouble();

            System.out.print("Inserisci il numero di litri di carburante consumati: ");
            double litriConsumati = input.nextDouble();

            if (litriConsumati != 0) {
                if (chilometriPercorsi != 0) {
                    double chilometriPerLitro = chilometriPercorsi / litriConsumati;
                    System.out.println("Il numero di chilometri per litro percorsi è: " + chilometriPerLitro);
                } else {
                    System.out.println("Errore: il numero di chilometri percorsi deve essere diverso da 0");
                }
            } else {
                System.out.println("Errore: il numero di litri di carburante consumati deve essere diverso da 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("Errore: inserire un valore numerico valido");
        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero");
        }
        input.close();
    }
}
