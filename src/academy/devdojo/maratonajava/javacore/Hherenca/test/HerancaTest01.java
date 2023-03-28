package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3 ");
        endereco.setCep("01234-54614");
        Pessoa pessoa = new Pessoa("Boljack");

        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("=========================================");
        Funcionario funcionario = new Funcionario("Pricesa Carolina","111111211111" );


        funcionario.setEndereco(endereco);
        funcionario.imprime();
        funcionario.relatorio();



    }
}
