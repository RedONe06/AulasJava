package Ex2;

import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Main {

    public static void main(String[] args) {
        double a[] = new double[6];
        double b[] = new double[6];
        int i = 0, j;
        String A = "A = ", B = "B = ";

        Scanner input = new Scanner(System.in);

        for (i = 0; i < a.length; i++) {
            System.out.println("Digite um número");
            a[i] = input.nextDouble();
            b[(b.length - 1) - i] = a[i];
            A += a[i] + ", ";
        }
        for (i = 0; i < b.length; i++) {
            B += b[i] + ", ";
        }
        System.out.println(A);
        System.out.println(B);
    }
}
