package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domino;
// O modificador final é uma CONSTANTE

// A variável deve ser escrita com letra maiscula e separada por anderline

// Não pode ser modificada em parte nenhuma do programa

// normalmente vc vai ver o modificador final sendo statico, pq ele nao pode mudar

// uma CLASSE final, suas açoes não podem ser modificadas

// quando eu não quero extender a minha classe, eu coloco final



// public final class Carro == > se eu tivesse privado a minha classe Carro
public class Carro {

    private String nome;
    public static final double VELOCIADAE_MAXIMA = 280;
    public final Comprador COMPRADOR = new Comprador();





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
