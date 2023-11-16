package Planos;

import Adicionais.AdicionaisInterface;

public class PlanoBigSuperClass implements PlanosBigInterface {
    private String nome;
    private String cpf;
    private String numeroTelefone;
    private AdicionaisInterface adicional;
    public PlanoBigSuperClass(String nome, String cpf, String numeroTelefone){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
    }
    public void setAdicional(AdicionaisInterface adicional) {
        this.adicional = adicional;
    }
    public double calculaPreco(double numeroDeDias){
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }
}
