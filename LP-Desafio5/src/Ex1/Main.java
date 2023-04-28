package Ex1;

import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Main {
    public static void main(String[] args) {
        double x;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        x = input.nextDouble();
        
        if(x%2 == 1){
            System.out.println("It's odd.");
        } else{
            System.out.println("It's pair");
        }
    }
}
