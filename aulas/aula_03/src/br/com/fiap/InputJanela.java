package br.com.fiap;

import javax.swing.*; // * importando tudo

public class InputJanela {
    public static void main(String[] args) {
        // Variaveis
        int num1 = 0, num2 = 0, resultado = 0;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite um numero inteiro"); // Recebe uma String
            num1 = Integer.parseInt(aux); // Convertendo para Int

            aux = JOptionPane.showInputDialog("Digite outro numero inteiro");
            num2 = Integer.parseInt(aux);

            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + resultado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo de numero incorreto!!!");

        }
    }
}
