package Concessionaria.java.Concessionaria;

public class Pessoa {
    private String nome;
    private String rg;
    private String telefone;

    // GETTERs
    public String getNome(){
        return nome;
    }
    public String getRg(){
        return rg;
    }
    public String getTelefone() {
        return telefone;
    }

    // SETTERs
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

}
