package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il tuo cognome");
        String cognome = scanner.nextLine();
        System.out.println("Inserisci il tuo colore preferito");
        String colorePreferito = scanner.nextLine();
        System.out.println("Inserisci il giorno in cui sei nato");
        int giornoNascita = scanner.nextInt();
        System.out.println("Inserisci il mese in cui sei nato");
        int meseNascita = scanner.nextInt();
        System.out.println("Inserisci l'anno in cui sei nato");
        int annoNascita = scanner.nextInt();

        int totale = giornoNascita + meseNascita + annoNascita;

        System.out.println("La tua password è " + nome + "-" + cognome + "-" + colorePreferito + "-" + totale);
    }
}
