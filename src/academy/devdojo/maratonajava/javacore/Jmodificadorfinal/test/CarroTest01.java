

package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domino.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro = new Carro();

        // Carro.VELOCIADAE_MAXIMA = 240; isso aqui vai dar erro, pq o modificador final não pode ser alterado

        System.out.println(Carro.VELOCIADAE_MAXIMA);

    }
}
