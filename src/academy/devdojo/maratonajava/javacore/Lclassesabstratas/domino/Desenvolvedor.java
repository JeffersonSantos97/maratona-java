package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domino;

public class Desenvolvedor extends Funcionario{

    private String lugarNaEquipe;
    public Desenvolvedor(String nome, double salario, String lugarNaEquipe) {

        super(nome,salario);
        this.lugarNaEquipe = lugarNaEquipe;


    }

    // sobscrição do metodo toString adicionando o lugar na equipe
    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "lugarNaEquipe='" + lugarNaEquipe + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    // implementando o metodo abstrato bonusSalario
    // como é abstrato, eu sou obrigado a criar o metodo bonusSalario, mesmo que eu crie ele vazio
    @Override
    public void bonusSalario() {
        this.salario = this.salario + this.salario * 0.1;
    }

    // sobscrição do metodo imprime que foi criado na classe Pessoa que é obrigatorio nas classes concretas

    @Override
    public void imprime() {

        System.out.println("imprimindo Desenvolvedor");
    }
}
