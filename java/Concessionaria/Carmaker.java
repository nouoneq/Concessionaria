package Concessionaria.java.Concessionaria;

public class Carmaker {
    private String cnpj;
    private String name;
    private String endereco;
    private String telefone;


    // GETTERs
    public String getCnpj() {
        return cnpj;
    }
    public String getName() {
        return name;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }

    //SETTERs
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

