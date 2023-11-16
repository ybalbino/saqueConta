package entidades;

import excecoes.ExcecaoComercial;

public class Conta {
    private Integer numero;
    private String titular;
    private Double balanco;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double balanco, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.balanco = balanco;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getBalanco() {
        return balanco;
    }

    public void setBalanco(Double balanco) {
        this.balanco = balanco;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double valor){
        balanco += valor;
    }

    public void saque(double valor){
        validaSaque(valor);
        if (balanco - valor < 0){
            throw new ExcecaoComercial("Erro saque: Saldo total insuficiente.");
        }
        balanco -= valor;
    }

    public void validaSaque(double valor){
        if (valor > getLimiteSaque()){
            throw new ExcecaoComercial("Erro de saque: O valor excede o limite de saque.");
        }
        if (valor > getLimiteSaque()){
            throw new ExcecaoComercial("Erro de saque: saldo insuficiente.");
        }
    }
}
