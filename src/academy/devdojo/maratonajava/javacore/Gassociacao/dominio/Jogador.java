package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {

    // atributo
    private String nome;
    private Time time;



    // metodo pra imprimir
    public void imprime() {

        System.out.println(this.nome);
    if(time != null){

        System.out.println(time.getNome());
    }

    }


    // Construtor
    // passar o nome como parametro

    public Jogador(String nome){

        this.nome = nome;
    }

    public Jogador(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }


}
