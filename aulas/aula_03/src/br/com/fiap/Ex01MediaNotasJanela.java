package br.com.fiap;

import javax.swing.*;

public class Ex01MediaNotasJanela {
    public static void main(String[] args) {
        float prova01 = 0, prova02 = 0, prova03 = 0, prova04 = 0, media = 0;
        String aux = "";

        try {
            aux = JOptionPane.showInputDialog("Digite a primeira nota: ");
            prova01 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a segunda nota: ");
            prova02 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a terceira nota: ");
            prova03 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a quarta nota: ");
            prova04 = Float.parseFloat(aux);

            media = (prova01 + prova02 + prova03 + prova04) / 4;
            JOptionPane.showMessageDialog(null, "Nota 01: " + prova01 + "\nNota 02: " + prova02 + "\nNota 03: " + prova03 + "\nNota 04: " + prova04 + "\nMedia: " + media);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "As notas devem ser numeros!!!");
        }
    }
}
