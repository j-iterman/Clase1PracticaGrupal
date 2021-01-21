package controller;

import java.util.Scanner;

public class Ejercicio1 {

    public static boolean esPar(int n){
        return n%2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < 2*n; i++){
            if (esPar(i)) System.out.println(i);
        }

        scanner.close();
    }
}
