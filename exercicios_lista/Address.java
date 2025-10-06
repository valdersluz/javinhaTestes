public class AddressBook {
    private address;
    private Contact[] contacts;

    public AddressBook(tipo address, int capacidade){
        this.address = address;
        this.contacts = new Contact[capacidade];
    }
    

    public void addContato(Contact contact, int posicao){
        if (posicao >= 0 && posicao < contact.length){
            contacts[posicao] = contact;
        } else {
            System.out.println("Local cheio.");
        }
                    
    }

    public void searchContact(Contact contact, String nome){
        
    }

    public void listContact(){
        System.out.println("Lista de contatos: ");
        for (Contact c : contacts) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }
    
    


}
