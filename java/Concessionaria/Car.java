package Concessionaria.java.Concessionaria;

public class Car {
    private int chassi;
    private int ano;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;


    // GETTERs
    public int getChassi() {
        return chassi;
    }
    public int getAno() {
        return ano;
    }
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }

    // SETTERs
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}
