package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domino;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){

        super(nome,salario);
    }
    // sobscrita do metodo bonusSalario
    @Override
    public void bonusSalario(){

        this.salario = this.salario + this.salario * 0.2;
    }

    // sobscrição do metodo imprime que foi criado na classe Pessoa que é obrigatorio nas classes concretas

    @Override
    public void imprime() {

        System.out.println("imprimindo Gerente");
    }



}
