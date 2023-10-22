package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        //creare 3 prodotti
        Prodotto prodotto= new Prodotto("prodotto 1", "questo è un prodotto 1", 14.0, 22);
        Prodotto prodotto2= new Prodotto("prodotto 2", "questo è un prodotto 2", 5.0, 24);
        Prodotto prodotto3= new Prodotto("prodotto 3", "questo è un prodotto 3", 10.0, 20);
        //stampare il nome completo + prezzo compreso di iva
        System.out.println("nome: " + prodotto.nomeCompleto() + " " + " " + prodotto.prezzoIva()+ "€");
        System.out.println("nome: " + prodotto2.nomeCompleto() + " " + " " + prodotto2.prezzoIva()+ "€");
        System.out.println("nome: " + prodotto3.nomeCompleto() + " " + " " + prodotto3.prezzoIva()+ "€");
    }

}
