package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    // Agora a gente vai fazer uma sobrecarga de metodo
    // Pagamentos no DÉBITO tem desconto de 10%
    // Pagamentos no CREDITO tem desconto de 5%

    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };


    // metodo abstrato serve praticamente só pra ser subscrevido por outros metodos e objetos
    public abstract double calcularDesconto(double valor);
}