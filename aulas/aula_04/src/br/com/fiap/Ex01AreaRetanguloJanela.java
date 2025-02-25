package br.com.fiap;

import javax.swing.*;

public class Ex01AreaRetanguloJanela {
    public static void main(String[] args) {
        float base = 0.0f, altura = 0.0f, area = 0.0f;
        String aux = "";

        try {
            aux = JOptionPane.showInputDialog("Digite a base do retangulo: ");
            base = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a altura do retangulo: ");
            altura = Float.parseFloat(aux);

            area = base * altura;
            JOptionPane.showMessageDialog(null, "Area do retangulo: " + area);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A base e altura devem ser numeros!!!");
        }
    }
}
