package academy.devdojo.maratonajava.javacore.Hherenca.dominio;
// Extends serve pra fazer a herança

// super() serve pra importa tudo que tem dentro do método da classe pai, pra classe filho

// com o protected serve pra que vc posssa usar o objeto do método livre em qualquer classe filha ( extends ) ou do mesmo pacote
// * sem precisar o get e o set
// protected tá na classe Pessoa ( dar uma olhada lá )

// pra usar o Construtor do método mãe, usa-se a palavra super() igual ao this



public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(String nome, String cpf){

        super(nome, cpf);


    }
    public void imprime(){

        // tudo que tem no método imprime da classe pai vai sair daqui + o atributo salario
        super.imprime();
        System.out.println(this.salario);

    }

    public void relatorio(){

        System.out.println("Eu " + this.nome + "do cpf " + this.cpf + " moro na rua " + this.endereco.getRua());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
