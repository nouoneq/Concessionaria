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

    public void consultaCliente(String name){
        System.out.printf("Nome: %s\n Endereco: %s\n",getName(), endereco);
    }


}
