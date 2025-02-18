package br.com.fiap;

public class Primitivo {
    public static void main(String[] args) {
        // declaração e iniciação de variáveis
        char genero = 'M';
        byte idade = 22;
        short salario = 1600;
        int rm = 554736, alunos = 50, salas = 10;
        long brasileiros = 216535748;
        float nota = 5.5f; // especificando que é float
        double dolar = 5.75;
        boolean sim = true;

        System.out.println("Genero: " + genero + "\nIdade: " + idade + "\nSalario: " + salario + "\nRMS: " + rm + "\t\tAlunos: " + alunos + "\t\tSalas: " + salas + "\nBrasileiros: " + brasileiros + "\nNota: " + nota + "\nDolar: " + dolar + "\nSim: " + sim);
    }
}
