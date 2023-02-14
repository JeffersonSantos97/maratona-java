package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;
/*
 Referencia a outro objto

 vc passa o parametro e esse parametro é usado dentro da class

 Na referencia a outro objeto, ao invés de vc passar um parametro de tipo primitivo, vc passa um objeto para poder usar
 os objetos dentro dessa classe que vai ser montada



*/
public class EstudanteTest01 {

    public static void main(String[] args) {
       Estudante estudante01 = new Estudante();
       Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

       estudante01.nome = "Shindi";
       estudante01.idade = 15;
       estudante01.sexo = 'T';


       estudante02.nome = "Missato";
       estudante02.idade = 32;
       estudante02.sexo = 'M';

       // faz referencia a Classe ImprimirEstudante que já está montado um retorno
       impressora.imprimir(estudante01);

       impressora.imprimir(estudante02);



       /*
            Jeito bruto, repetindo muitos prints
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("----------------------------- ");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

*/



    }
}
