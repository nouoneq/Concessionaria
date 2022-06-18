package Concessionaria.java.Concessionaria;

public class Pessoa {
    private String name;
    private String rg;
    private String telefone;

    // GETTERs
    public String getName(){
        return name;
    }
    public String getRg(){
        return rg;
    }
    public String getTelefone() {
        return telefone;
    }

    // SETTERs
    public void setName(String name){
        this.name = name;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

}
