package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;


public class Escola {

    private String nome;
    private Professor[] professores;

    // quando eu criar um objeto de Escola, tenho que passar o nome e os professores
    public Escola(String nome, Professor[] professores) {

        this.nome = nome;
        this.professores = professores;
    }

    // Metodo pra imprimir

    public void imprimir(){

        if(this.professores == null) return;
        for(Professor prof : professores){

            System.out.println(prof.getNome());
        }
        System.out.println(this.nome);
    }

    public String getNome(){ return nome; }
    public void setNome(String nome) { this.nome = nome;}

    public Professor[] getProfessores(){ return this.professores; }

    public void setProfessores(Professor[] professores) { this.professores = professores; }


}
