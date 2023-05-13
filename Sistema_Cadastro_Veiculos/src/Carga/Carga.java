package Carga;

import InterfaceCalcular.Calcular;
import Veiculos.Veiculos;
import java.text.DecimalFormat;

public final class Carga extends Veiculos implements Calcular {

    private int cargaMax;
    private int tara;

    public Carga() {
        super();
        this.cargaMax = 0;
        this.tara = 0;
    }

    public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia, int cargaMax, int tara) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public float calcVel(float velocMax) {

        return velocMax * 100000;
    }
    DecimalFormat df = new DecimalFormat();

    @Override
    public String toString() {
        return super.toString() + "Velocida (km/h): " + this.getVelocMax() + "\n"
                + "Velocidade (C/h):" + df.format(this.calcVel(getVelocMax())) + "\n"
                + "cargaMax: " + cargaMax + "\n"
                + "tara:" + tara + "\n\n";
    }

    @Override
    public int cacular() {

        String srt = this.getCor() + this.getMarca() + this.getModelo() + this.getPlaca();
        return srt.length();
    }

}
