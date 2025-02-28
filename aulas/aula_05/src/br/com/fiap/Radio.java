package br.com.fiap;

public class Radio {
    // declaracao de atributos
    public int volume;
    public float estacao;

    // declaracao de metodos
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarEstacao(float frequencia) {
        estacao = frequencia;
    }
}
