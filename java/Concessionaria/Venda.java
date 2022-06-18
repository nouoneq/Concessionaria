package Concessionaria.java.Concessionaria;

public class Venda {
    private String numNota;
    private String formaPagam;
    private double valorTotal;


    // GETTERs
    public String getNumNota() {
        return numNota;
    }
    public String getFormaPagam() {
        return formaPagam;
    }
    public double getValorTotal() {
        return valorTotal;
    }

    // SETTERs
    public void setNumNota(String numNota) {
        this.numNota = numNota;
    }
    public void setFormaPagam(String formaPagam) {
        this.formaPagam = formaPagam;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

