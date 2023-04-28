package Ex3;

import java.util.Scanner;

/* @author Andriele Joras dos Santos
   @date 14/05/2022 */

//Faça um algoritmo que leia 3 idades, calcule a média das idades 
//e escreva o resultado.
public class Main {

    public static void main(String[] args) {
        int age1, age2, age3, average;

        Scanner input = new Scanner(System.in);
        age1 = input.nextInt();
        age2 = input.nextInt();
        age3 = input.nextInt();

        average = (age1 + age2 + age3) / 3;
        System.out.println(average);
    }
}
