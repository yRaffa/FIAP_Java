package br.com.fiap;

import java.util.Scanner;

public class Ex02IdadeConsole {
    public static void main(String[] args) {
        int anoAtual = 0, anoDeNascimento = 0, idade = 0;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite o ano atual: ");
            anoAtual = scan.nextInt();

            System.out.print("Digite seu ano de nascimento: ");
            anoDeNascimento = scan.nextInt();

            idade = anoAtual - anoDeNascimento;
            System.out.println("Idade: " + idade);

        } catch (Exception e) {
            System.out.println("As datas devem ser numeros inteiros!!!");
        }
    }
}
