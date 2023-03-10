package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {

    private String nome;
    private  Jogador[] jogadores;



    public Time(String nome){

        this.nome = nome;
    }

    public void imprime(){

        System.out.println(this.nome);
        if(jogadores == null) return;

        for(Jogador jog : jogadores) {

            System.out.println(jog.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return this.jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
