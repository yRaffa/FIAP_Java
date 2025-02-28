package br.com.fiap;

public class Computador {
    public String estado;
    public int volume;
    public float temperatura;

    public void mudarEstado(String novoEstado) {
        estado = novoEstado;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void verificarTemperatura(){
        System.out.println("Temperatura: " + temperatura);
    }
}
