package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros(); //  printa 20 na tela
        calculadora.subtraiDoisNumeros(); // printa 10 na tela
        System.out.println("Finalizando CalculadoraTeste01");
    }
}
