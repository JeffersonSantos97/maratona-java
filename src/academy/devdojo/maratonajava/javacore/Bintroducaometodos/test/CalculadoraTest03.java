package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // posso colocar ou ela dentro de uma variável que vai assumir o retorno que está dentro do método
        // ou eu posso já printar direto

        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result); // 10

        System.out.println(calculadora.divideDoisNumeros(20,2)); // printando direto sem uma variável


    }
}
