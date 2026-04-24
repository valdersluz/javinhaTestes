package br.edu.ifba.inf008.myproject;


public class Main {
    public static void main(String[] args) {

        /*int[] c = new int[12];

        System.out.printf("    %s   %s%n", "Index", "Value");

        for (int i = 0; i < c.length; i++){
            System.out.printf("%5d%8d%n", i, c[i]);
        }
        */

        final int ARRAY_LENGTH = 10;
        int[] arr = new int[ARRAY_LENGTH];

        for (int i = 0; i < arr.length; i++){
            arr[i] = 2 + 2 * i;
        }

        System.out.printf("    %s   %s%n", "Index", "Value");

        for (int i = 0; i < arr.length; i++){
            System.out.printf("%5d%8d%n", i, arr[i]);
        }


    }
}