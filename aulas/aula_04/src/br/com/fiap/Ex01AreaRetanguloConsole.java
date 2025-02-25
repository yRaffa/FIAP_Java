package br.com.fiap;

import java.util.Scanner;

public class Ex01AreaRetanguloConsole {
    public static void main(String[] args) {
        float base = 0.0f, altura = 0.0f, area = 0.0f;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite a base do retangulo: ");
            base = scan.nextFloat();

            System.out.print("Digite a altura do retangulo: ");
            altura = scan.nextFloat();

            area = base * altura;
            System.out.println("Area do retangulo: " + area);

            scan.close();
        } catch (Exception e) {
            System.out.println("A base e altura devem ser numeros!!!");
        }
    }
}
