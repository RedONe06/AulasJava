package Atvdd1;

public class Main {
    public static void main(String[] args) {
        int chico, ze, alturaChico, alturaZe;
        int anos;
        
        alturaChico = 150;
        alturaZe = 110;
        anos = 1;
        
        while(alturaChico!= alturaZe){
            alturaChico = alturaChico + 2;
            alturaZe = alturaZe + 3;
            anos++;
        }
        System.out.println("São necessários " + anos + " anos");
    }
}
