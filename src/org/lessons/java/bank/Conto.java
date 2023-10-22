package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    //numero conto
    private int numeroConto;
    //nome proprietario
    private String nomeProprietario;
    //saldo
    private double saldo;

    public Conto(String nomeProprietario){
        this.numeroConto= getNumeroConto();
        this.nomeProprietario= nomeProprietario;
        this.saldo= 0;
    }

    // proprietario lettura e scrittura
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    //numero e saldo solo lettura
    public int getContoNumero() {
        return numeroConto;
    }

    public double getSaldo() {
        return saldo;
    }

    //metodo per versare denaro sul conto
    public void versare(double value){
        saldo += value;
    }
    //metodo per prelevare dal conto(senza diventare negativo)
    public void prelevare(double value){
        if (saldo - value < 0){
            System.out.println("Ci dispiace non puoi prelevare più di quanto hai sul conto");
        }else{
            saldo -= value;
        }
    }

    //metodo numero conto da 1 a 1000
    private int getNumeroConto(){
        Random random = new Random();
        this.numeroConto = random.nextInt(1,1000);
        return this.numeroConto;
    }

}
