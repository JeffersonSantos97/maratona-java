package academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.dominio;

public class Professor {

    // Atributos
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    // Construtor que vai ter que passar um nome sempre que criar um objeto Professor
    public Professor(String nome) {

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
