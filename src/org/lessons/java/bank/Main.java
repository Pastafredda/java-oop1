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
        System.out.println("Hai a disposizione " + conto.getSaldo() +"€");
        while (true){
            System.out.println("Premi: 1 per VERSARE, 2 per PRELEVARE, 3 per USCIRE");
            int scelta = scanner.nextInt();
            if (scelta == 3){
                break;
            }
            System.out.println("inserisci l'importo");
            double importo = scanner.nextInt();
            if (scelta == 1){
                conto.versare(importo);
                System.out.println("Hai versato "+ importo + "€"+" il tuo saldo adesso è di " + conto.getSaldo()+ "€");
            } else if (scelta == 2) {
                if(importo > conto.getSaldo()){
                    conto.prelevare(importo);
                    System.out.println("Riprova, il tuo saldo è " + conto.getSaldo() + "€");
                }else {
                    conto.prelevare(importo);
                    System.out.println("Hai prelevato "+ importo + "€"+" il tuo saldo adesso è di " + conto.getSaldo()+ "€");
                }
            }
        }
        System.out.println("il tuo saldo è di " + conto.getSaldo() + "€");
        scanner.close();
    }
}
