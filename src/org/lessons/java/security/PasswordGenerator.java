package org.lessons.java.security;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il tuo cognome");
        String cognome = scanner.nextLine();
        System.out.println("Inserisci il tuo colore preferito");
        String colorePreferito = scanner.nextLine();
        System.out.println("Inserisci la data di nascita");
        String dataDiNascita = scanner.nextLine();

        String[] arrayNascita = dataDiNascita.split("[/-]");

        int totaleDataDiNascita = 0;

        for (String num : arrayNascita) {
        totaleDataDiNascita += parseInt(num);
        }

        System.out.printf("La tua password è %s-%s-%s-%s",nome,cognome,colorePreferito,totaleDataDiNascita);
        scanner.close();
    }
}
