package br.ulbra.classes;

public class Juridica extends Pessoa {
    
    private String CNPJ;
    private String nomeFantasia;
    private double valorPatrimonio;

    public Juridica(String CNPJ, String nomeFantasia, double valorPatrimonio) {
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
        this.valorPatrimonio = valorPatrimonio;
    }

    public Juridica(String CNPJ, String nomeFantasia, double valorPatrimonio, String nome, int anoNascimento, String endereco) {
        super(nome, anoNascimento, endereco);
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
        this.valorPatrimonio = valorPatrimonio;
    }

    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public double getValorPatrimonio() {
        return valorPatrimonio;
    }
    public void setValorPatrimonio(double valorPatrimonio) {
        this.valorPatrimonio = valorPatrimonio;
    }

    @Override
    public String toString() {
        return "Juridica{" + "CNPJ=" + CNPJ + ", nomeFantasia=" + nomeFantasia + ", valorPatrimonio=" + valorPatrimonio + '}';
    }
}
