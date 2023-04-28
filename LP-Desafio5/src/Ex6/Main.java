package Ex6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input the 1th number:");
        a = input.nextDouble();
        System.out.println("Input the 2th number:");
        b = input.nextDouble();
        System.out.println("Input the 3th number:");
        c = input.nextDouble();
        
        if(a>b){
            if(a>c){
                System.out.println("The number " + a +" is bigger.");
            } else{
                System.out.println("The number " + c + " is bigger.");
            }
        }else{
            if(b>c){
                System.out.println("The number " + b + " is bigger.");
            }else{
                System.out.println("The number " + c + " is bigger.");
            }
        }  
    }
}
