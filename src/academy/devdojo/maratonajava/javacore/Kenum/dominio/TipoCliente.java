package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {

    // Posso também colocar atributos dentro dos meus ENUM
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    // Eu pego o valor do atirbuto "valor", quando eu chamar o meu enum
    private int valor;
    private String nomeRelatorio;
    TipoCliente(int valor, String nomeRelatorio){

        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    // Saber o tipo do cliente pelos atributos do objeto
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        // values() vai inteirar todos os tipos de clientes

        for(TipoCliente tipoCliente : values() ){

            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {

                return tipoCliente;
            }

        }
        return null;
    }

    public static TipoCliente tipoClientePorNumero(int valor){

        for(TipoCliente tipoCliente : values()) {

            if(tipoCliente.getValor() == valor) {

                return tipoCliente;
            }
        }

        return null;
    }

    public int getValor(){

        return valor;
    }

    public String getNomeRelatorio(){

        return nomeRelatorio;
    }

    // Não faz sentido colocar set no valor, pq eu não vou querer mudar o valor

}
