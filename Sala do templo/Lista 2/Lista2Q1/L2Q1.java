package Lista2Q1;

class L2Q1
{
    public static void main(String[] args)
    {
        System.out.println("=== Criando sala ===");
        Sala s1 = new Sala(103, 40);

        Sala refA = s1;
        Sala refB = s1;

        System.out.println("Antes da mudança");

        refA.display();
        refB.display();

        refA.setStatus(true);

        System.out.println("Depois da mudança");

        // refA.display();
        refB.display();

        System.out.println("Novo objeto");

        Sala novaSala = new Sala(202, 50);

        novaSala.setStatus(true);

        System.out.println("s1:");
        s1.display();

        System.out.println("novaSala:");
        novaSala.display();

        System.out.println("=== Criando reserva ===");
        Reserva r1 = new Reserva(s1, "João");
        r1.display();




    }
}
