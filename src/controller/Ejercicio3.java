package controller;

import java.util.Scanner;

public class Ejercicio3 {

    public static boolean esPrimo(int n){
        if (n > 2 && n % 2 == 0) return false;

        for (int i = 3; i <= (int)Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.println(esPrimo(n));

        scanner.close();
    }

}
