package academy.devdojo.maratonajava.introducao;
/*
Existem outras formas de inteirar um array
int [] vetor1 = { 1,5,6,7,9 }
int [] vetor = new int[5] { 1,2,6,8 }

*/

/*
    Foreach é uma outra forma de imprimir um array
    ( int i : vetor1 )

*/
public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] forma1 = { 1,2,8,9}; // outra forma de se inteirar um array
        int[] forma2 = new int[] {1,3,5,6};

        // forma 1
        System.out.println("Tamanho do forma1: " + forma1.length); // 4
        System.out.println("Segundo elemento do forma1: " + forma1[1]); // 2

        System.out.println(); // pular uma linha
        // forma 2

        System.out.println("Tamanho do forma 2: " + forma2.length);
        System.out.println("Terceiro elemento da forma 2: " + forma2[2]);

        // Foreach

        for (int i : forma1){
                // vai imprimir a posição i do vetor forma
                //  começa no primeiro e termina no ultimo vetor
            System.out.println(i);
        }
        }
    }
