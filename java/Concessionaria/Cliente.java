package Concessionaria.java.Concessionaria;

public class Cliente extends Pessoa {
    private String endereco;

    // GETTERs
    public String getEndereco(){
        return endereco;
    }

    // SETTERs
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void consultaCliente(){
        System.out.printf("Nome: %s\nEndereco: %s\nTelefone: %s\nRG: %s\n",getNome(), getEndereco(), getTelefone(), getRg());
    }


}
