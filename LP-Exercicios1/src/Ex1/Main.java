package Ex1;

/* @author Andriele Joras dos Santos
   @date 14/05/2022 */

//Dados 5 números, monte um algoritmo que permita obter como
//resultado a soma, o produto e a média dos valores recebidos.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instances
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        Operation operations = new Operation();
        
        //input
        System.out.println("Input 1th value:");
        operations.setN1(input.nextDouble());
        System.out.println("Input 2th value:");
        operations.setN2(input.nextDouble());
        System.out.println("Input 3th value:");
        operations.setN3(input.nextDouble());
        System.out.println("Input 4th value:");
        operations.setN4(input.nextDouble());
        System.out.println("Input 5th value:");
        operations.setN5(input.nextDouble());
        
        //processing
        System.out.println("The sum is: " + decimal.format(operations.sum()));
        System.out.println("The average is: " + decimal.format(operations.average()));
        System.out.println("The product is: " + decimal.format(operations.product()));
    }
}
