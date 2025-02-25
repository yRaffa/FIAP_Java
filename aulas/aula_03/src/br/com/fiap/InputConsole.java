package br.com.fiap;

import java.util.Scanner;

public class InputConsole {
    public static void main(String[] args) {
        // Variaveis
        int num1 = 0, num2 = 0, resultado = 0;
        Scanner scan = new Scanner(System.in); // Instanciação do scan

        try {
            System.out.print("Digite um numero inteiro: ");
            num1 = scan.nextInt(); // Recebe um Input

            System.out.print("Digite outro numero inteiro: ");
            num2 = scan.nextInt();

            resultado = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + resultado);

        } catch (Exception e) {
            System.out.println("Tipo de numero incorreto!!!");

        }
    }
}
