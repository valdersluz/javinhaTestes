package br.edu.ifba.inf008.l1q2;


class CashRegister {

    private double currentBalance;
    private int transactionCount;
    private String registerId;


    public CashRegister(double currentBalance){
        setCurrentBalance(currentBalance);
    }

    public CashRegister(double currentBalance, int transactionCount){
        this(currentBalance);
        setTransactionCount(transactionCount);
    }

    public CashRegister(double currentBalance, int transactionCount, String registerId){
        this(currentBalance, transactionCount, registerId);
    }

    public double getCurrentBalance() { return currentBalance; }
    public void setCurrentBalance(double currentBalance){ this.currentBalance = currentBalance; }

    public int getTransactionCount() {return transactionCount; }
    public void setTransactionCount(int transactionCount) { this.transactionCount = transactionCount; }

    public String getRegisterId() { return registerId; }
    public void setRegisterId(String registerId) { this.registerId = registerId; }

    public void processPayment(double amount) {
        if (getCurrentBalance(currentBalance) <= 0){
            System.out.println("Sem saldo na conta.");
        }
        System.out.println("Saldo era de: " + getCurrentBalance(currentBalance));
        this.currentBalance = (this.currentBalance - amount);
        System.out.println("E agora é: " getCurrentBalance);
    }

    public void processRefund(double amount){
        System.out.println("Saldo era de: " + getCurrentBalance(currentBalance));
        this.currentBalance = (this.currentBalance + amount);
        System.out.println("E agora é: " getCurrentBalance);
    }

    public void getDailyReport(){

    }

    // fazer a sobrecarga dos métodos a seguir
}
