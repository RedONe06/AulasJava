package Atvdd2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double num, acImpar, acPar, nImpar, media;
        
        num = 1;
        acPar=0;
        acImpar=0;
        nImpar = 0;
        
        Scanner input = new Scanner(System.in);
        
        while(num>=0){ //enquanto for positivo
            System.out.println("Digite um número positivo: ");
            num = input.nextDouble(); //recebe um número
            
            if(num < 0){ //se for negativo
                System.out.println("Número negativo, saindo."); //sai do while
                if(acImpar != 0){ //se ele já acumulado imprime as infos
                    media = (acImpar)/nImpar;
                    System.out.println("A média dos ímpares é: " + media);
                    System.out.println("A soma dos pares é: " + acPar);
                }
            }else{
                if(num%2 == 1){
                    nImpar++;
                    acImpar += num;//soma dos números impares
                } else{
                    acPar += num; //soma dos números pares
                }
            }
        }
    }
}
