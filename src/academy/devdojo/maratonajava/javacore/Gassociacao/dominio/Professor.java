package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    // Atributo
    private String nome;

    // Construtor

    // quando eu criar um atribuito professor, eu tenho que passa o nome
    public Professor(String nome){

        this.nome = nome;
    }

    // Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
