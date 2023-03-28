package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;
// 1 - Alocar espaco em memoria para o objeto
// 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passada
// 3 - Bloco de inicializacao é executado
// 4 - Construtor é executado



public class Anime {
    private String nome;
    // private int[] epsodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    private int[] epsodios;

    // bloco de inicialização
    {
        epsodios = new int[100];
        for(int i = 0 ; i < epsodios.length; i++) {

            epsodios[i] = i + 1;
        }
        System.out.println("Dentro do bloco de inicializacao");
    }


    public Anime(String nome) {

        this.nome = nome;
    }
    public Anime(){
        epsodios = new int[100];
    // coloquei no bloco de inicializacao
    /*
        for(int i = 0; i < epsodios.length; i++) {

            epsodios[i] = i + 1;
        }
*/
        System.out.println(epsodios);

        for(int epsodio : epsodios) {

            System.out.println( epsodio + " ");
        }
    }

    public String getNome(){

        return this.nome;
    }

    public int [] getEpsodios(){

        return this.epsodios;
    }

    
}
