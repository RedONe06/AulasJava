package Ex6;

import java.util.Scanner;

/* @author Andriele Joras dos Santos
   @date 14/05/2022 */

/*Considerando que o aumento dos funcionários é de 75%
do INPC e mais um percentual de produtividade discutido
com a empresa. Construir um algoritmo que leia o número 
do funcionário, seu salário atual, o valor do INPC e o índice
de produtividade e escreve o número do funcionário, seu aumento e
o valor de seu novo salário.*/

public class Main {
    public static void main(String[] args) {
        double increase=0, productivity, employeeNumb, salary, INPC, newSalary=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter employee's number: ");
        employeeNumb = input.nextDouble();
        System.out.println("Enter employee's actual salary: ");
        salary = input.nextDouble();
        System.out.println("Enter INPC: ");
        INPC = input.nextDouble();
        System.out.println("Enter employee's index of productivity: ");
        productivity = input.nextDouble();
        
        increase = (INPC*0.75)+ (salary*(productivity/100));
        newSalary = salary + increase;
        
        System.out.println("Employee number: " + employeeNumb+
                "\nIncrease = " + increase +
                "\nNewSalary = " + newSalary);
        
        
        

                
        
    }
}
