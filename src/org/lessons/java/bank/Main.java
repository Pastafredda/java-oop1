package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci nome");
        String nomeProprietario= scanner.nextLine();

        Conto conto = new Conto(nomeProprietario);
        System.out.println("Ciao " + nomeProprietario);
        System.out.println("il tuo numero conto è " + conto.getContoNumero());
        System.out.println("Hai a disposizione " +conto.getSaldo() +"€");

    }
}
