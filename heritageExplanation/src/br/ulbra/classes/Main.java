package br.ulbra.classes;

//@author Andriele Joras dos Santos
//15/03/22 - Noturno

public class Main {
    public static void main(String[] args){
        
        // Classe pai
        Pessoa pessoa = new Pessoa();
        
        // Classes filhas
        Juridica juridica = new Juridica("2333", "Empresa legal", 300000, "Andriele", 2004, "EUA");
        Fisica fisica = new Fisica("2222222", "Feminino", "Andriele", 2004, "EUA");
             
    }
}
