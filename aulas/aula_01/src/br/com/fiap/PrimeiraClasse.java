// Diagrama de classes: https://app.diagrams.net/

// Polimorfismo:

// Sobrescrita: Sobrescreve métodos de mesmo nome das classes 'Pai' na herança.

// Sobrcarga: Diversos metodos de mesmo nome, mas com 'assinaturas' diferentes
// exibir(texto) -> exibir("Hello World!")
// exibir(texto, numero) -> exibir("Ola Mundo", 33)

package br.com.fiap;

public class PrimeiraClasse {
    // main
    public static void main(String[] args) {
        // sout ("" - string | '' - char)
        System.out.println("Hello World!");
        System.out.println('A');
    }
}
