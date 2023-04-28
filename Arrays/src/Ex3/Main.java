package Ex3;

import java.util.Scanner;

/**
 * @author s.lucas
 */
public class Main {

    public static void main(String[] args) {
        
        double a[] = new double[15], b[] = new double[10], c[] = new double[5];
        String A = "A= ", B = "B= ", C = "C= ";
        int i = 0;

        Scanner input = new Scanner(System.in);

        for (i = 0; i < a.length; i++) {
            System.out.println("Digite um número: ");
            a[i] = input.nextDouble();
            if (i <= 9) {
                b[i] = a[i];
                B += b[i] + ", ";
            } else {
                c[i - 10] = a[i];
                C += c[i-10] + ", ";
            }
            A += a[i] + ", ";
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }
}
