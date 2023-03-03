package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

// A palavra (this) faz sobrecarga de construtores

public class Anime {

    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;
    private int ano;

    public Anime(String nome, String tipo, int epsodios, String genero){

        this(); // esse this() vazio, chama o construtor que está vazio sem argumetos
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int epsodios, String genero, int ano ){
    // Essa sobrecarga vai ter a sobrecarda de cima + o novo atributo que entrou ( ano )
        this(nome,  tipo, epsodios, genero);
        this.ano = ano;
    }

    public Anime(){

        System.out.println("Primeira sobrecarga ");
    }

}
