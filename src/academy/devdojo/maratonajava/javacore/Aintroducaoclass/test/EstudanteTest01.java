package academy.devdojo.maratonajava.javacore.Aintroducaoclass.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclass.dominio.Estudante;
/*
    Essa aula tem um print que conecta a essa aula

    - Nessa aula aprendeu a criar um classe
    - criar um objeto da classe
    - criar uma variável de referencia
    - dar valor pros atributos ( caracteristicas ) do objeto




* */
public class EstudanteTest01 {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();// Criar um objeto
//      Classe    variaveel de
            //    referencia



        // Obs: O Atributo já pode ser pré definido na Classe

        estudante01.nome = "Luffy"; // valores para os atributos das váriaveis de instancia
         estudante01.idade = 21;
        estudante01.sexo = 'M';



        estudante02.nome = "Jefferson";
        estudante02.idade = 26;
        estudante02.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);


    }
}
