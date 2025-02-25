package br.com.fiap;

import java.util.Scanner;

public class Ex03AreaCirculoConsole {
    public static void main(String[] args) {
        double raio = 0.0f, area = 0.0f;
        final double PI = 3.1415f;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite o raio do circulo: ");
            raio = scan.nextDouble();

            // area = PI * (raio * raio);
            area = PI * Math.pow(raio, 2);
            System.out.println("Area do circulo: " + area);

            scan.close();
        } catch (Exception e) {
            System.out.println("O raio deve ser um numero!!!");
        }
    }
}
