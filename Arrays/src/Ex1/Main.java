package Ex1;

import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Main {
    public static void main(String[] args) {
        
        String name;
        int i;
        double average=0;
        double nota[] = new double[10];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Seu nome: ");
        name = input.nextLine();
        
        for(i=0;i<nota.length;i++){
            System.out.println("Nota "+(i+1)+":");
            nota[i]=input.nextDouble();
            average+=nota[i];
        }
        
        average = average/i;
        System.out.println("A média: " + average);
    }
}
