package Adicionais;

public class Internet implements AdicionaisInterface{
    private String nome;
    private int mega;
    public Internet(String nome, int mega){
        this.nome = nome;
        this.mega = mega;
    }
    @Override
    public double getValorAdicional(int numeroDias) {
        return mega * 0.05 * numeroDias;
    }
    @Override
    public String getDescricao() {
        StringBuilder sb = new StringBuilder("Internet\n");
        sb.append("Nome: ").append(nome).append(", Dados: ").append(mega);
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public int getMega() {
        return mega;
    }
}