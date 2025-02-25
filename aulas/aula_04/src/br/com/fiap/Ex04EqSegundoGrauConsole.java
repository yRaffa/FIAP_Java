package br.com.fiap;

import java.util.Scanner;

public class Ex04EqSegundoGrauConsole {
    public static void main(String[] args) {
        double a = 0.0, b = 0.0, c = 0.0, x1 = 0.0, x2 = 0.0, delta = 0.0;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite o valor de 'a': ");
            a = scan.nextDouble();

            System.out.print("Digite o valor de 'b': ");
            b = scan.nextDouble();

            System.out.print("Digite o valor de 'c': ");
            c = scan.nextDouble();

            delta = Math.pow(b, 2) - (4 * a * c);
            x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
            x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
            System.out.println(
                    "a: " + a + "\nb: " + b + "\nc: " + c + "\n\ndelta: " + delta + "\n\nx1: " + x1 + "\nx2: " + x2);

            scan.close();
        } catch (Exception e) {
            System.out.println("'a', 'b' e 'c' devem ser numeros!!!");
        }
    }
}
