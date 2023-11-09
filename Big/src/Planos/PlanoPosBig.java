package Planos;

public class PlanoPosBig extends PlanoBigSuperClass implements PlanosBigInterface {
    private String nome;
    private String cpf;
    private String numeroTelefone;
    private double valorDia;
    public PlanoPosBig(String nome, String cpf, String numeroTelefone, double valorDia){
        super(nome, cpf, numeroTelefone);
        this.valorDia = valorDia;
    }
    public double calculaPreco(double valorDia, int numeroDias){
        double valorTotal = valorDia * numeroDias;
        return valorTotal;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Telefonia:\n");
        sb.append("Nome: ").append(nome).append(", cpf: ").append(cpf + "\n");
        sb.append("Telefone: ").append(numeroTelefone + "\n");
        return sb.toString();
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

    public double getValorDia() {
        return valorDia;
    }
}
