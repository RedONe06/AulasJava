package br.ulbra.classes;

public class Pessoa {
    
    protected String nome;
    protected int anoNascimento;
    protected String endereco;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, int anoNascimento, String endereco) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{ " + "nome=" + nome + ", anoNascimento=" + anoNascimento + ", endereco=" + endereco + '}';
    }
    
    
    
}
