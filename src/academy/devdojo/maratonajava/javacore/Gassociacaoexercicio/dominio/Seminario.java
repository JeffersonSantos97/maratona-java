package academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.dominio;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    // private Aluno[] alunos = new Aluno[100]; se eu quisesse colocar um limites já de aluno
    private Local local;

    private Professor professor;

    // constructor Seminario pra já iniciar com o titulo
    public Seminario(String titulo) {

        this.titulo = titulo;
    }
    // metodo imprime
    public void imprime() {

        System.out.println("Titulo : " + this.titulo);

        System.out.printf("Professor: %s%n", professor.getNome());

        System.out.printf("Local: %s%n", local.getEndereco());


        if (alunos == null) return; // se não tiver aluno, faz o return que funciona como um break;

        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {

            System.out.println(aluno.getNome());
        }
    }

    // Getters and setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
