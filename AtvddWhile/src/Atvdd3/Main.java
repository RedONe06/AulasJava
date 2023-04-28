package Atvdd3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int f1, f2 = 1, p, c1, c2;

        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        f1 = input.nextInt();

        while (f2 < 11) {
            p = f1*f2;
            System.out.println(f1 + " + " + f2 + " = " + p);
            f2++;
        }
    }
}
