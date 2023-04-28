package Ex5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int age;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the age: ");
        age = input.nextInt();
        
        if(age>=5 && age<=7){
            System.out.println("Infant A");
        } else if (age>=8 && age<=10){
            System.out.println("Infant B");
        } else if(age>=11 && age<=13){
            System.out.println("Juvenile A");
        } else if(age>=14 && age<=17){
            System.out.println("Juvenile B");
        } else if(age>=18){
            System.out.println("Adult");
        } else {
            System.out.println("Invalid age");
        }
    }
}
