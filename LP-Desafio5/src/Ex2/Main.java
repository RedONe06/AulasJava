package Ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a:");
        a = input.nextDouble();
        System.out.println("Enter number b:");
        b = input.nextDouble();
        
        if(a%b == 0){
            System.out.println("Are multiple");
        } else {
            System.out.println("Aren't multiple");
        }
    }
}
