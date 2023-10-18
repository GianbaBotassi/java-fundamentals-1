package org.lessons.java;

import java.util.Scanner;

public class TicketTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKm = 0.21;
        int lower18 = 20;
        int over65 = 40;

        System.out.println("Quanti km vuoi percorrere?");
        int kmDaPercorrere = scanner.nextInt();
        System.out.println("Quanti anni hai?");
        int eta = scanner.nextInt();

        double total = kmDaPercorrere * priceKm;

        if(eta < 18){
            total = total * (100 - lower18) / 100;
        } else if (eta >=65) {
            total = total * (100 - over65) / 100;
        }

        System.out.println("La somma che devi pagare è pari a " + total + "€.");

        scanner.close();
    }
}
