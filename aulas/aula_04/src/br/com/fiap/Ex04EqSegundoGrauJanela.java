package br.com.fiap;

import javax.swing.*;

public class Ex04EqSegundoGrauJanela {
    public static void main(String[] args) {
        double a = 0.0, b = 0.0, c = 0.0, x1 = 0.0, x2 = 0.0, delta = 0.0;
        String aux = "";

        try {
            aux = JOptionPane.showInputDialog("Digite o valor de 'a': ");
            a = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog("Digite o valor de 'b': ");
            b = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog("Digite o valor de 'c': ");
            c = Double.parseDouble(aux);

            delta = Math.pow(b, 2) - (4 * a * c);
            x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
            x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null,
                    "a: " + a + "\nb: " + b + "\nc: " + c + "\n\ndelta: " + delta + "\n\nx1: " + x1 + "\nx2: " + x2);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "'a', 'b' e 'c' devem ser numeros!!!");
        }
    }
}
