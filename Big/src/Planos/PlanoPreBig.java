package Planos;

import Planos.PlanoBigSuperClass;

public class PlanoPreBig extends PlanoBigSuperClass implements PlanosBigInterface {
    private String nome;
    private String cpf;
    private String numeroTelefone;
    private int dias = 20;
    private double valorInicial;
    private double valorExcedente;
    public PlanoPreBig(String nome, String cpf, String numeroTelefone, int dias, double valorInicial, double valorExcedente){
        super(nome, cpf, numeroTelefone);
        this.dias = dias;
        this.valorInicial = valorInicial;
        this.valorExcedente = valorExcedente;
    }
    public double calculaPreco(double valorInicial, double valorExcedente, int numeroDias) {
        setDias(dias);
        double valorTotal;
        if (dias < numeroDias) return valorInicial;
        else {
            valorTotal = (numeroDias - dias) * valorExcedente;
        }
        return valorTotal;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("Telefonia:\n");
        sb.append("Nome: ").append(nome).append(", cpf: ").append(cpf + "\n");
        sb.append("Telefone: ").append(numeroTelefone + "\n");
        sb.append("Dias do plano: ").append(dias);
        return sb.toString();
    }
    public void setDias(int dias) {
        this.dias = dias;
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

    public int getDias() {
        return dias;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public double getValorExcedente() {
        return valorExcedente;
    }
}
