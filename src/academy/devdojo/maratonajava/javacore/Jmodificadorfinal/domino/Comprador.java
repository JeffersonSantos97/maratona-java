package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domino;

public class Comprador {

    private String nome;

    public String toString(){

        return "Comprador: " + this.nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getNome(){

        return this.nome;
    }
}
