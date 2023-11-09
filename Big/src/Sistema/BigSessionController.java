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
    public BigSessionController(){
        this.planos = new HashMap<>();
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
    public double valorAPagar(int idPlano, int numeroDeDias){
        return this.planos.get(idPlano).calculaPreco(numeroDeDias);
    }
    public String exibirPlano(int idPlano){
        return "";
    }
    public Map<Integer, PlanoBigSuperClass> exibirPlanos(){
        return this.planos;
    }

    public int getIdPlano() {
        return this.idPlano;
    }
    public int cadastrarAdicionalInternet(String nome, int mega){
        if(nome.isBlank()) throw new NullPointerException("Nome inválido!");
        idAdicional ++;
        return idAdicional;
    }
    public int cadastraAdicionalMusica(String nome, String servico){
        if(nome.isBlank()) throw new NullPointerException("Nome inválido!");
        if(servico.isBlank()) throw new NullPointerException("Serviço inválido");
        idAdicional ++;
        return idAdicional;
    }
    public void setAdicional(int idPlano, int idAdicional){

    }
}
