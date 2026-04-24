class App {
    public static void main (String args[]){

        String obj = "Qualquer texto entre aspas é uma String  ";

        System.out.println("O que tem dentro de texto é: " + obj);
        System.out.println("E o tamanho dela é: " + obj.length());
        System.out.println("Sem espaço: " + obj.trim());
        System.out.println("Upper Case: " + obj.toUpperCase());
        System.out.println("hash code: " + obj.hashCode());

    }
}
