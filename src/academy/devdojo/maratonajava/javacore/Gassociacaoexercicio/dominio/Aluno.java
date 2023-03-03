package academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.dominio;

public class Aluno {

    // atributos
    private String nome;
    private String idade;

    // construtor que é obrigatório passsar um nome na hora de criar um objeto de Aluno
    public Aluno(String nome) {

        this.nome = nome;
    }
    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
