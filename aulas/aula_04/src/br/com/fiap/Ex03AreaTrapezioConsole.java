package br.com.fiap;

import java.util.Scanner;

public class Ex03AreaTrapezioConsole {
    public static void main(String[] args) {
        float base01 = 0.0f, base02 = 0.0f, altura = 0.0f, area = 0.0f;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite a base 01 do trapezio: ");
            base01 = scan.nextFloat();

            System.out.print("Digite a base 02 do trapezio: ");
            base02 = scan.nextFloat();

            System.out.print("Digite a altura do trapezio: ");
            altura = scan.nextFloat();

            area = ((base01 + base02) * altura) / 2;
            System.out.println("Area do trapezio: " + area);

            scan.close();
        } catch (Exception e) {
            System.out.println("As bases e altura devem ser numeros!!!");
        }
    }
}
