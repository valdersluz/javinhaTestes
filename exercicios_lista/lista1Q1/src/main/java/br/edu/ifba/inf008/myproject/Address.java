package br.edu.ifba.inf008.myproject;

class Address {


    private Contact[] contacts = new Contact[100];
    private int proxPosicao = 0;


    public boolean addContact(Contact contact){
        if (proxPosicao == contacts.length)
            return false;

        contacts[proxPosicao++] = contact;
        return true;
                    
    }

    public Contact findByName(String name){
        for(int i = 0; i < proxPosicao; ++i){
            if(contacts[i].getName() == name){
                return contacts[i];
            }
        }

        return null;
    }

    public void listContact(){
        System.out.println("Lista de contatos: ");

        for (int i = 0; i < proxPosicao; ++i){
            //System.out.println(contacts[i].displayInfo());
            contacts[i].displayInfo();

        }
    }

}
