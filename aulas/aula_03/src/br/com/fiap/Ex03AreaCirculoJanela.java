package br.com.fiap;

import javax.swing.*;

public class Ex03AreaCirculoJanela {
    public static void main(String[] args) {
        float raio = 0.0f, area = 0.0f, pi = 3.14f;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite o raio do circulo: ");
            raio = Float.parseFloat(aux);

            area = pi * (raio * raio);
            JOptionPane.showMessageDialog(null, "Area do circulo: " + area);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O raio deve ser um numero!!!");
        }
    }
}
