package Ex5;

import java.util.Scanner;

/* @author Andriele Joras dos Santos
   @date 14/05/2022 */

/*Calcule a área de uma circunferência, sabendo que a fórmula 
é A=PI*R2. receba R e PI, onde A é a variável que conterá o 
resultado da área,  R o valor do raio e PI é 3,14. escreva o 
resultado da área em A.*/

public class Main {
    public static void main(String[] args) {
        double r, PI = 3.14, a;
        
        Scanner input = new Scanner(System.in);

        r = input.nextDouble();
        
        a = PI*(r*r);
        System.out.println(a);
    }
}
