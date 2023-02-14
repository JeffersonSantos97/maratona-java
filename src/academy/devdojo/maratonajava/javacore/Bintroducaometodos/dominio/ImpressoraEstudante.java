package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {

    /* Faz referencia ao objeto Estudante

    */
    public void imprimir(Estudante estudante){

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Goku";
    }

}
