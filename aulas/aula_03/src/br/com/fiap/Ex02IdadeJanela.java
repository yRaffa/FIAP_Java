package br.com.fiap;

import javax.swing.*;

public class Ex02IdadeJanela {
    public static void main(String[] args) {
        int anoAtual = 0, anoNascimento = 0, idade = 0;
        String aux = "";

        try {
            aux = JOptionPane.showInputDialog("Digite o ano atual: ");
            anoAtual = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite seu ano de nascimento: ");
            anoNascimento = Integer.parseInt(aux);

            idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Idade: " + idade);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "As datas devem ser numeros inteiros!!!");
        }
    }
}
