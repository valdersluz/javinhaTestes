// Teste do livro de Deitel: Java, como programar


public class Welcome1
{
    public static void main(String[] args)
    {
        System.out.print("Bem-vindo ao");
        System.out.println("Primeiro programa em Java!");

        //onde a JVM está procurando classes
        // se sair . é o diretório atual
        String classpath = System.getProperty("java.class.path");

        System.out.println("Classpath: ");
        System.out.println(classpath);
    }
} 
