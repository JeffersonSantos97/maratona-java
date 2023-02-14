package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] somaArray = new int[] {1, 2, 3, 4, 5} ; // esse é um jeito de passar o array sem fazer o loop for

        calculadora.somaArray(somaArray); // vai retornar 15
        // nesse metodo a gente teve que criar um array e passar a variável como parametro

        /* modo com varArgs */

        calculadora.somaVarArgs(1,2,3,4,5); // vai retor 15 também
        // mas nesse metodo a gente já vai passar o valor das nossos arrays já dentro como se fossem parametros


    }
}
