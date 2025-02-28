package br.com.fiap;

public class Main {
    public static void main(String[] args) {
        // declaracao de objetos
        // = instanciacao do obejeto
        Radio radio01 = new Radio();

        // atribuindo valores aos atributos
        radio01.estacao = 89.1f;
        radio01.volume = 5;

        // executando metodos
        radio01.trocarEstacao(95.5f);
        radio01.aumentarVolume();
        radio01.aumentarVolume();
        radio01.aumentarVolume();

        System.out.println("Volume atual: " + radio01.volume + "\nEstacao atual: " + radio01.estacao);
    }
}
