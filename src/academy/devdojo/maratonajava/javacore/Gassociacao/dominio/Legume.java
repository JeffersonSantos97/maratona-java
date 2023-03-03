package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Legume {

    private String nome;
    private Hortifruti hortifruti;

    public Legume(String nome){

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
