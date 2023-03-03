package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Fruta {

    private String nome;
    private Hortifruti hortifruti;

    public Fruta(String nome) {

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hortifruti getHortifruti() {
        return hortifruti;
    }

    public void setHortifruti(Hortifruti hortifruti) {
        this.hortifruti = hortifruti;
    }
}