package academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.dominio;
// Sobrecarga de Métodos é quando vc precisa adicionar mais um atributo no metodo criado, mas não quer quebra

// pra se criar uma sobrecarga de metodo é só colocar o mesmo nome do método, mas com o atributo a mais que vc precisava

// no exemplo a gente teve que colocar mais um atributo que é o nome e o genero

public class Anime {

    private String tipo;

    private int epsodios;

    private String nome;

    private String genero;

    public void init(String tipo, int epsodios){

        this.tipo = tipo;
        this.epsodios = epsodios;
    }

    // precisei criar mais um atributo que é chamado nome
    // agora eu vou usar a sobrecarga de metodos, pois vou criar mais um metodo com o mesmo nome
    // mas adicionando o atributo nome

    public void init(String tipo, int epsodios, String nome){

        this.init(tipo,epsodios); // pra que eu não tenha que repetir tudo que estava dentro no primeiro init
        this.nome = nome;
    }

    // agora pediram pra eu adicionar mais um atributo que é o genero do Anime

    public void init(String tipo, int epsodios, String nome, String genero){

        this.init(tipo, epsodios, nome);
        this.genero = genero;
    }

    public void imprime(){

        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.nome);
        System.out.println(this.genero);

    }
    public void setTipo(String tipo){

        this.tipo = tipo;
    }

    public void setEpsodios(int epsodios) {

        this.epsodios = epsodios;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setGenero(String genero){

        this.genero = genero;
    }

    public String getTipo(){

        return this.tipo;
    }
    public int getEpsodios(){

        return this.epsodios;
    }

    public String getNome(){

        return this.nome;
    }

    public String getGenero(){

        return this.genero;
    }


}
