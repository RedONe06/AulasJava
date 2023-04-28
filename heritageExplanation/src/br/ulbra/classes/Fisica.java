package br.ulbra.classes;

public class Fisica extends Pessoa {
    
    private String CPF;
    private String sexo;

    public Fisica(String CPF, String sexo) {
        this.CPF = CPF;
        this.sexo = sexo;
    }

    public Fisica(String CPF, String sexo, String nome, int anoNascimento, String endereco) {
        super(nome, anoNascimento, endereco);
        this.CPF = CPF;
        this.sexo = sexo;
    }
    
    public void setCPF(String cpf){
        this.CPF = cpf;
    }
    public String getCPF(){
        return CPF;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }

    @Override
    public String toString() {
        return "Fisica{" + "CPF=" + CPF + ", sexo=" + sexo + '}';
    }
    
}
