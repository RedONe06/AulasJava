package br.ulbra.classes;

public class Assistente extends Funcionario{
    
    protected int numMatricula;

    public Assistente() {
        super();
    }
    
    public int getNumMatricula(){
        return this.numMatricula;
    }
    
    public void exibeDados(){
        System.out.println(this.numMatricula);
    }
    
    public String exibeDados(String teste){
        return "" + this.numMatricula;
    } 
    
    
    
    
}
