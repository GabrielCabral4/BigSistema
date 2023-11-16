package Sistema;

import Adicionais.AdicionaisInterface;
import Planos.PlanoBigSuperClass;
import Planos.PlanoPosBig;
import Planos.PlanoPreBig;

import java.util.HashMap;
import java.util.Map;

public class BigSessionController {
    private int idPlano;
    private int idAdicional;
    private Map<Integer, PlanoBigSuperClass> planos;
    private Map<Integer, AdicionaisInterface> adicionais;
    public BigSessionController(){
        this.planos = new HashMap<>();
        this.adicionais = new HashMap<>();
    }
    public int cadastrarPlanoPreBig(String nome, String cpf, String numeroTelefone, int dias, double valorInicial, double valorExcedente){
        if(nome.isBlank()) throw new NullPointerException("Nome inválido!");
        if(cpf.isBlank()) throw new NullPointerException("Cpf inválido!");
        if(numeroTelefone.isBlank()) throw new NullPointerException("Telefone inválido!");
        idPlano ++;
        planos.put(idPlano, new PlanoPreBig(nome, cpf, numeroTelefone, dias, valorInicial, valorExcedente));
        return idPlano;
    }
    public int cadastrarPlanoPosBig(String nome, String cpf, String numeroTelefone, double valorDia){
        if(nome.isBlank()) throw new NullPointerException("Nome inválido!");
        if(cpf.isBlank()) throw new NullPointerException("Cpf inválido!");
        if(numeroTelefone.isBlank()) throw new NullPointerException("Telefone inválido!");
        idPlano ++;
        this.planos.put(idPlano, new PlanoPosBig(nome, cpf, numeroTelefone, valorDia));
        return idPlano;
    }
    public int cadastrarAdicionalInternet(String nome, int mega){
        if(nome.isBlank()) throw new NullPointerException("Nome inválido!");
        if(mega < 0) throw new IllegalArgumentException("A quantidade de megas não pode ser menor que 0.");
        idAdicional ++;
        return idAdicional;
    }
    public int cadastraAdicionalMusica(String nome, String servico){
        if(nome.isBlank()) throw new NullPointerException("Nome inválido!");
        if(servico.isBlank()) throw new NullPointerException("Serviço inválido");
        idAdicional ++;
        return idAdicional;
    }
    public double valorAPagar(int idPlano, int numeroDeDias) {
        return this.planos.get(idPlano).calculaPreco(numeroDeDias);
    }
    public void setAdicional(int idPlano, int idAdicional){
        if(idPlano < 0) throw new IllegalArgumentException("Não existe plano com esse id!");
        if(idAdicional < 0) throw new IllegalArgumentException("Não existe adicional com esse id!");
        this.planos.get(idPlano).setAdicional(this.adicionais.get(idAdicional));
    }
    public String exibirPlano(int idPlano){
        return this.planos.get(idPlano).toString();
    }
    public Map<Integer, PlanoBigSuperClass> exibirPlanos(){
        return this.planos;
    }
    public Map<Integer, AdicionaisInterface> exibirAdicionais(){
        return this.adicionais;
    }
    public int getIdPlano() {
        return this.idPlano;
    }
}
