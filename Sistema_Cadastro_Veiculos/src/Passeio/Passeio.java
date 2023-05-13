package Passeio;

import InterfaceCalcular.Calcular;
import Veiculos.Veiculos;
import java.text.DecimalFormat;

public final class  Passeio extends Veiculos implements Calcular {

    private int qtdPassageiros;

    public Passeio(int qtdPassageiros) {
        super();
        this.qtdPassageiros = 0;
    }

    public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia, int qtdPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
        this.qtdPassageiros = qtdPassageiros;
    }



    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public float calcVel(float velocMax) {
    
        return velocMax * 1000;
    }
    DecimalFormat df = new DecimalFormat();

    @Override
    public String toString() {
        return super.toString() + "Velocida (km/h): " + this.getVelocMax() + "\n"
                + "Velocidade (M/h):" + df.format(this.calcVel(getVelocMax()))+"\n"
                + "Quantidade Passageiro:" + qtdPassageiros;
    }

    @Override
    public int cacular() {

        String srt = this.getCor() + this.getMarca() + this.getModelo() + this.getPlaca();
        return srt.length();

    }

   

}
