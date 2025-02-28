package br.com.fiap;

public class Main {
    public static void main(String[] args) {
        // declaracao de objetos
        // = instanciacao do obejeto
        Radio radio01 = new Radio();
        Televisor televisor01 = new Televisor();
        ArCondicionado ar = new ArCondicionado();
        Computador pc = new Computador();

        // atribuindo valores aos atributos
        radio01.volume = 5;
        radio01.estacao = 89.1f;

        // executando metodos
        radio01.trocarEstacao(95.5f);
        radio01.aumentarVolume();
        radio01.aumentarVolume();
        radio01.aumentarVolume();
        System.out.println("\nRadio - Volume atual: " + radio01.volume + "\nRadio - Estacao atual: " + radio01.estacao);

        televisor01.volume = 10;
        televisor01.canal = 30;

        televisor01.trocarCanal(50);
        televisor01.aumentarVolume();
        televisor01.aumentarVolume();
        televisor01.aumentarVolume();
        televisor01.aumentarVolume();
        televisor01.aumentarVolume();
        System.out.println("\nTV - Volume atual: " + televisor01.volume + "\nTV - Canal atual: " + televisor01.canal);

        ar.modo = "ventilar";
        ar.temperatura = 20;

        ar.trocarModo("resfriar");
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        System.out.printf("\nAr - Temperatura atual: " + ar.temperatura + "\nAr - Modo atual: " + ar.modo);

        
    }
}
