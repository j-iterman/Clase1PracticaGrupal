package controller;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese m: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese d: ");
        char d = scanner.next().charAt(0);

        int contador = 0;

        for (int i = 0; contador < n; i++){

            int contadorD = 0;

            for(char c: String.valueOf(i).toCharArray()){
                if (c == d) contadorD++;
            }

            if (contadorD >= m) {
                System.out.println(i);
                contador++;
            }
        }

        scanner.close();

    }

}
