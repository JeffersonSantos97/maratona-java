package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        // dar valor pros atributos
        funcionario.nome = "Jefferson";
        funcionario.idade = 26;
        funcionario.salarios = new double[]{1630.50, 1630.50, 1630.50};

        funcionario.imprimir();



    }

}
