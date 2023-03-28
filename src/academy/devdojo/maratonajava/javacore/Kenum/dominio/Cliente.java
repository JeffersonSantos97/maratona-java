package academy.devdojo.maratonajava.javacore.Kenum.dominio;
// ao invés de usar uma constante, é possivel passar um Enum
// o Enum força vc passar o que está dentro do enum
public class Cliente {

    // É possivel criar um enum dentro de uma classe
    // Mas não é o mais indicado



    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){

        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() + // getnomeRelatorio é pra tirar o tipo em UPPERCASE e deixar mais bonitinho
                ", tipoClienteInt=" + tipoCliente.getValor() + // Vai ser passsado o valor, de acordo com o meu tipo de cliente
                '}';
    }
}
