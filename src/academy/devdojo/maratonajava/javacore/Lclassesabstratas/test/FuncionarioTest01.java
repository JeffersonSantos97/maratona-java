package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domino.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domino.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Marcos", 2000);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Jefferson", 25000, "Senior");

        System.out.println(desenvolvedor1);
        System.out.println(gerente1);

    }
}
