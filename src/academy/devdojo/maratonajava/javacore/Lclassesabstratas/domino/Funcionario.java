package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domino;

// As classes abstratas são como templates
// elas não poderam mais ser usadas pra criar objetos, mas sim só servir de herança pra outras classes

// uma classe abstrata pode ter metodos tanto concretos, como abstratos

// mas um metodo abstrato só pode existir dentro de uma classe abstrata


public abstract class Funcionario extends Pessoa{

    protected String nome;
    protected double salario;
        public Funcionario(String nome, double salario){

            this.nome = nome;
            this.salario = salario;
            bonusSalario();
        }

        // sobscrevendo na classe abstrata filha
    /*
    @Override

    public void imprime() {
        System.out.println("imprimindo");
    }
*/


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    // bonus do salario

    public abstract void bonusSalario();
}
