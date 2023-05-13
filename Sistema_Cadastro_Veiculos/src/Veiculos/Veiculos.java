package Veiculos;

import Exception.VelocException;
import Motor.Motor;

public abstract class Veiculos {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;

    private Motor motor;

    public Veiculos() {

        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velocMax = (float) 0.0;
        this.qtdRodas = 0;
        this.motor = new Motor();

    }

    public Veiculos(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia) {

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor(qtdPist, potencia);

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocMax() {

        return velocMax;
    }

    public void setVelocMax(float velocMax) {

        this.velocMax = velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public abstract float calcVel(float velocMax);

    @Override
    public String toString() {
        return "Placa: " + placa + "\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Cor: " + cor + "\n"
                + "Quantidade Rodas: " + qtdRodas + "\n"
                + motor + "\n";
    }

}
