package br.edu.ifba.inf008.myproject;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Abimael", "71988889999", "abimaelzin@email.com.br");

        Address addressBook = new Address();

        System.out.println(addressBook.addContact(contact1));
        addressBook.listContact();
    }
}
