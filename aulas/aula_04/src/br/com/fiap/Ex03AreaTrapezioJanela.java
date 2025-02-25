package br.com.fiap;

import javax.swing.*;

public class Ex03AreaTrapezioJanela {
    public static void main(String[] args) {
        float base01 = 0.0f, base02 = 0.0f, altura = 0.0f, area = 0.0f;
        String aux = "";

        try {
            aux = JOptionPane.showInputDialog("Digite a base 01 do trapezio: ");
            base01 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a base 01 do trapezio: ");
            base02 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a altura do trapezio: ");
            altura = Float.parseFloat(aux);

            area = ((base01 + base02) * altura) / 2;
            JOptionPane.showMessageDialog(null, "Area do trapezio: " + area);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "As bases e altura devem ser numeros!!!");
        }
    }
}
