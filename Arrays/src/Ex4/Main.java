package Ex4;
/**
 * @author s.lucas
 */
public class Main {
    public static void main(String[] args) {
        int numero[] = new int[8];
        int i;
        i = 1;
        numero[i+2]=28;
        i+=7;
        numero[i]=43;
        i=2;
        numero[i%2]=9;
        i++;
        numero[i]=6+i;
        for(i=0;i<8;i++){
            System.out.println("Vetor: ["+ i + "] = " + numero[i]);
        }
    }
}
