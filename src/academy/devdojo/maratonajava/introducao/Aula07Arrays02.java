package academy.devdojo.maratonajava.introducao;
/*
    inicialização padrão de um array

    * byte, short, int, long = 0

    * float, double = 0.0;

    * char = '\u0000'

    * boolean = false

    * String = null

 */

/*
    Aprendi a inteirar um array
*/
public class Aula07Arrays02 {
    public static void main(String[] args) {

        String[]vetor = new String[3];

        vetor[0] = "Messi";
        vetor[1] = "Cristiano Ronaldo";
        vetor[2] = "Neymar";

        // Para inteirar um array, usamos o loop for
       for(int i = 0 ; i < vetor.length; i++) {

           System.out.println(vetor[i]);

       }
    }
}
