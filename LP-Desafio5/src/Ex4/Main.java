package Ex4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int code;
        double salary, newSalary;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Position code: ");
        code = input.nextInt();
        System.out.println("Salary: ");
        salary = input.nextDouble();

        switch (code) {
            case 101:
                newSalary = salary + 0.1 * salary;
                System.out.println("Salary: " + salary);
                System.out.println("New salary: " + newSalary);
                break;
            case 102:
                newSalary = salary + 0.2 * salary;
                System.out.println("Salary: " + salary);
                System.out.println("New saláry: " + newSalary);
                break;
            case 103:
                newSalary = salary + 0.3 * salary;
                System.out.println("Salary: " + salary);
                System.out.println("New saláry: " + newSalary);
                break;
            default:
                newSalary = salary + 0.4 * salary;
                System.out.println("Salary: " + salary);
                System.out.println("New saláry: " + newSalary);
        }
    }
}
