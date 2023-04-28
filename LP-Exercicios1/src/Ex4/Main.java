package Ex4;

import java.util.Scanner;

/* @author Andriele Joras dos Santos
   @date 14/05/2022 */

 /*Receba dois valores nas variáveis A e B  respectivamente, 
troque o valor contido na variável A pelo valor em B, e o 
valor em B pelo valor em A, isto é, imprimiremos A e B 
com os valores trocados.*/

public class Main {

    public static void main(String[] args) {
        String a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextLine();
        System.out.println("Enter b: ");
        b = input.nextLine();

        c = a;
        a = b;
        b = c;
        System.out.println(a+b);
    }
}
