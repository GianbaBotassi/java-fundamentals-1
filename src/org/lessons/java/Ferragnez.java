package org.lessons.java;

import java.util.Scanner;

public class Ferragnez {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        boolean inList = false;

        System.out.println("Come ti chiami?");
        String nomeUser = scanner.nextLine();

//       Cycle for
//        for(String nome : invitati){
//            if (nomeUser.equalsIgnoreCase(nome.toLowerCase())){
//                inList = true;
//                break;
//            }
//        }

//      Cycle while
        int i = 0;
        while(i < invitati.length){
            if (nomeUser.equalsIgnoreCase(invitati[i].toLowerCase())){
               inList = true;
               break;
           }
                i++;
        }

        System.out.println(inList ? "Entra pure!" : "Non sei invitato!");
    }
}
