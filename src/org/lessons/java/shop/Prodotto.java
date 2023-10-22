package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    //codice
    private int codice;
    // nome
    private String nome;
    // descrizione
    private String descrizione;
    // prezzo
    private double prezzo;
    // iva
    private int iva;

    //creazione oggetto con attributi tranne codice

    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = randomCodice();
    }

    //codice è un numero random ed è accessibile solo in lettura
    public int getCodice() {
        return codice;
    }

    //gli altri lettura e scrittura
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
    //prodotto ha sia prezzo base che compreso iva
    public double prezzoIva(){
        double valoreIva = (this.prezzo * this.iva) / 100;
        return this.prezzo + valoreIva;
    }

    //metodo per avere il nome esteso codice-nome
    public String nomeCompleto(){
        return this.codice + "-" +this.nome ;
    }

    //metodo numero random codice
    private int randomCodice(){
        Random random = new Random();
        this.codice = random.nextInt(10000000, 100000000);
        return this.codice;
    }
}
