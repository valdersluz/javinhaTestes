package br.edu.ifba.inf008.l1q2;

public class Main {
    public static void main(String[] args) {

        CashRegister cr1 = new CashRegister(100.0, 1);

        System.out.println(cr1.getCurrentBalance() + " - " + cr1.getTransactionCount());

    }
}
