package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante02;

public class EstudanteTest02 {

    public static void main(String[] args) {

        Estudante02 estudante01 = new Estudante02();
        Estudante02 estudante02 = new Estudante02();

        estudante01.nome = "Naruto";
        estudante01.idade = 14;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        estudante01.imprime();





    }
}
