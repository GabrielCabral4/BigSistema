package Planos;

public class PlanoBigSuperClass implements PlanosBigInterface {
    private String nome;
    private String cpf;
    private String numeroTelefone;
    public PlanoBigSuperClass(String nome, String cpf, String numeroTelefone){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
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
