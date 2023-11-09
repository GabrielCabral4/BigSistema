package Adicionais;

public class Musica implements AdicionaisInterface{
    private String nome;
    private String servico;
    public Musica(String nome, String servico){
        this.nome = nome;
        this.servico = servico;
    }
    @Override
    public double getValorAdicional(int numeroDias) {
        return 0;
    }
    @Override
    public String getDescricao() {
        StringBuilder sb = new StringBuilder("Música");
        sb.append("Nome: ").append(nome).append(", serviço: ").append(servico);
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public String getServico() {
        return servico;
    }
}