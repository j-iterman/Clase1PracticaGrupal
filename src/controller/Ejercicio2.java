package controller;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese m: ");
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(m*i);
        }

        scanner.close();
    }

}
