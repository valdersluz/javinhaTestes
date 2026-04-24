import java.util.Scanner;

public class AccountTest
{
    public static void main(String args[])
    {
        Account account1 = new Account("Jane Green, 52.00");
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Entre o valor para depósito para conta 1: ");
    }


}
