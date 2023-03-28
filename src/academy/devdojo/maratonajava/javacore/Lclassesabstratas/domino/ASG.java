package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domino;

public class ASG extends Funcionario {

    public ASG(String nome, double salario) {

        super(nome,salario);
    }

    // como se o ASG não ganhasse bonus
    // eu criei o metodo, mas deixei ele vazio


    @Override
    public void bonusSalario() {

    }

    // sobscrição do metodo imprime que foi criado na classe Pessoa que é obrigatorio nas classes concretas

    @Override
    public void imprime() {

        System.out.println("imprimindo ASG");
    }
}
