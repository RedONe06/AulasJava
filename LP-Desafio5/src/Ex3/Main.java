package Ex3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double saldoMedio, credito;

        Scanner input = new Scanner(System.in);
        
        System.out.println("saldo medio");
        saldoMedio = input.nextDouble();

        if (saldoMedio <= 200 && saldoMedio >= 0) {
            credito = 0;
            System.out.println("Credito: " + credito
            + "\nSaldo médio: " + saldoMedio);
        } else if(saldoMedio>200 && saldoMedio<=400){
            credito = saldoMedio*0.2;
            System.out.println("Credito: " + credito
            + "\nSaldo médio: " + saldoMedio);
        }else if(saldoMedio>400 && saldoMedio<=600){
            credito = saldoMedio*0.3;
            System.out.println("Credito: " + credito
            + "\nSaldo médio: " + saldoMedio);
        }else if(saldoMedio>600){
            credito = saldoMedio*0.4;
            System.out.println("Credito: " + credito
            + "\nSaldo médio: " + saldoMedio);
        }else{
            System.out.println("Valor negativo");
        }
    }
}
