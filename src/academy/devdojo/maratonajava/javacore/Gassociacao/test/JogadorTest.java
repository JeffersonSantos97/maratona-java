package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Garrincha");
        Jogador jogador3 = new Jogador("Romário");

        Jogador[] jogadores = new Jogador[3];

        for(Jogador jogador : jogadores){

            jogador.imprime();
        }

    }
}