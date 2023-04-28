package Ex2;

import java.util.Scanner;

/* @author Andriele Joras dos Santos
   @date 14/05/2022 */

//Faça um algoritmo que some duas variáveis e mostre a resposta.

public class Main {
    public static void main(String[] args) {
        double a,b,sum;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        sum = a+b;
        System.out.println(sum);
    }
}
