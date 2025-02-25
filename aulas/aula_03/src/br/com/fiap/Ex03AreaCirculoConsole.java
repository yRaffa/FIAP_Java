package br.com.fiap;

import java.util.Scanner;

public class Ex03AreaCirculoConsole {
    public static void main(String[] args) {
        float raio = 0.0f, area = 0.0f, pi = 3.14f;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite o raio do circulo: ");
            raio = scan.nextFloat();

            area = pi * (raio * raio);
            System.out.println("Area do circulo: " + area);

        } catch (Exception e) {
            System.out.println("O raio deve ser um numero!!!");
        }
    }
}
