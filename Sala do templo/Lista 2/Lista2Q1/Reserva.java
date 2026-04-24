package Lista2Q1;

class Reserva
{
    private Sala referenceRoom;
    private String owner;

    public Reserva(Sala referenceRoom, String owner)
    {
        this.referenceRoom = referenceRoom;
        this.owner = owner;
    }

    public void changeRoom(Sala novaSala)
    {
        this.referenceRoom = novaSala;
    }

    public void display()
    {
        System.out.println("Reserva de: " + owner);
        referenceRoom.display();
    }
}
