package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;
/*
Criar uma classe funcionario com os seguintes atributos

    nome
    idade
    salario // tres salarios devem ser guardados

    crie dois metodos

    1. Para imprimir os dados
    2. Para tirar media dos salarios e imprimir o resultado


 */

public class Funcionario{

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
       // caso não tenh salarios, nem precisa retornar os salarios
        if(salarios == null){

            return; // return funciona como break;
        }
        for(double salario : salarios){

            System.out.print(salario + " ");
        }

    imprimirMediaSalarios();


    }

    public void imprimirMediaSalarios(){
       // caso não tenha os salarios já nem precisa fazer a logica da media
        if(salarios == null ) {

            return; // return funciona como um break
        }
        double media = 0;

        for(double salario : salarios ) {

            media += salario;
        }
       media /= salarios.length;

        System.out.println("\nMedia: " + media);

    }



}