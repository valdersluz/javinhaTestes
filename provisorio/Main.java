class Player
{
    public String name;
}

class Main
{
    public static void display(Player p) { // p = p1
        p.name = "NOVO NOME";
        System.out.println(p.name);
    }
    public static void main(String args[]) {
        String s1 = null;
        System.out.println(s1);
        String s2 = "JOAO"; // String s2 = new String("JOAO")
        System.out.println(s2);
        Player p1 = new Player();
        p1.name = "MARIA";
        System.out.println(p1.name.startsWith("MA"));

        display(p1);
        System.out.println(p1.name);
        Player p2 = p1;
        p2.name = "ALICE";
        display(p1);

        Player p3 = new Player();
        Player p4 = new Player(); // Reference Counting
        p4 = p3;
        System.gc(); // Forcando a execucao do GC
    }
}
