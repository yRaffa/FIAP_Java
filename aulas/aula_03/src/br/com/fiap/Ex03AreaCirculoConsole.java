package br.com.fiap;

import java.util.Scanner;

public class Ex03AreaCirculoConsole {
    public static void main(String[] args) {
        float raio = 0.0f, area = 0.0f;
        final float PI = 3.1415f;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite o raio do circulo: ");
            raio = scan.nextFloat();

            area = PI * (raio * raio);
            System.out.println("Area do circulo: " + area);

        } catch (Exception e) {
            System.out.println("O raio deve ser um numero!!!");
        }
    }
}
