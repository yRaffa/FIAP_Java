package br.com.fiap;

public class ArCondicionado {
    public int temperatura;
    public String modo;

    void aumentarTemperatura() {
        temperatura++;
    }

    void  diminuirTemperatura() {
        temperatura--;
    }

    void trocarModo(String novoModo) {
        modo = novoModo;
    }
}
