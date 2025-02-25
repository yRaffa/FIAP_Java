package br.com.fiap;

import java.util.Scanner;

public class Ex01MediaNotasConsole {
    public static void main(String[] args) {
        float prova01 = 0.0f, prova02 = 0.0f, prova03 = 0.0f, prova04 = 0.0f, media = 0.0f;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite a primeira nota: ");
            prova01 = scan.nextFloat();

            System.out.print("Digite a segunda nota: ");
            prova02 = scan.nextFloat();

            System.out.print("Digite a terceira nota: ");
            prova03 = scan.nextFloat();

            System.out.print("Digite a quarta nota: ");
            prova04 = scan.nextFloat();

            media = (prova01 + prova02 + prova03 + prova04) / 4;
            System.out.println("Nota 01: " + prova01 + "\nNota 02: " + prova02 + "\nNota 03: " + prova03 + "\nNota 04: " + prova04 + "\nMedia: " + media);

        } catch (Exception e) {
            System.out.println("As notas devem ser numeros!!!");
        }
    }
}
