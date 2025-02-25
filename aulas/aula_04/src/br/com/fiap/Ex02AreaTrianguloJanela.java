package br.com.fiap;

import javax.swing.*;

public class Ex02AreaTrianguloJanela {
    public static void main(String[] args) {
        float base = 0.0f, altura = 0.0f, area = 0.0f;
        String aux = "";

        try {
            aux = JOptionPane.showInputDialog("Digite a base do triangulo: ");
            base = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a altura do triangulo: ");
            altura = Float.parseFloat(aux);

            area = (base * altura) / 2;
            JOptionPane.showMessageDialog(null, "Area do triangulo: " + area);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A base e altura devem ser numeros!!!");
        }
    }
}
