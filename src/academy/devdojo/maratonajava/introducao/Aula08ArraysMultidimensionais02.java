package academy.devdojo.maratonajava.introducao;
/*
    Definir o tamanho do do array em cada espaço de memória ( definir a quantidade de espaços pra linha )

    Como só o 1º colchete é ornigatório, eu poço definir a quantidade do 2º para cada espaço do primeiro

 */
public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // 0,1,2,3.... 11 meses ( vai até 11 pq janeiro comeca no 0 )
        // 30, 27, 29, 31.... dias ( quantidade de espaços pra cada mes )

        // Cada mes do ano vai ter uma quantidade de espaço


        int[][] meses = new int[4][];

        // janeiro vai ter 31 dias
        meses[0] = new int[31];


        // fevereiro 28 dias

        meses[1] = new int[28];

        // março 31 dias

        meses[2] = new int[31];

        // abril 30 dias

        meses[3] = new int[30];

        for(int[] arrBase: meses){
            System.out.println(" =============================================== ");
            for(int num : arrBase){


                System.out.print(num);
            }
            System.out.println();
        }


    }
}
