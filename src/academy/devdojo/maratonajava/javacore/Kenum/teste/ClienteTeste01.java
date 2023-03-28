package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPessoa;


public class ClienteTeste01 {

    public static void main(String[] args) {


        // agora quando eu for passar um tipo, obrigatoriamente tem que ser ou PESSOA_FISICA OU PESSOA_FISICA
        Cliente cliente1 = new Cliente("Jefferson", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Ana Beatriz", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        // testando o desconto para debito e credito
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println();
        System.out.println(cliente1);
        System.out.println(cliente2);

        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente1);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNumero(2);
        System.out.println(tipoCliente2);

    }
}
