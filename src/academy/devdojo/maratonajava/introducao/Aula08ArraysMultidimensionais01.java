package academy.devdojo.maratonajava.introducao;
/*
* Multidimensionais são array de arrays
* Acresta mais um colchete
* 1º colchete é a coluna
* 2º colchete é a linha
* Só é obrigatório definir o 1º tamanho
* o 1º colchete guarda a posição na memória ( olhar o print no celular de multidimensionais )

 */

/*
     Foreach na matriz multidimensional
     * primeiro eu crio um arrBase pra ser o 1º colchete ( coluna ) e
     depois eu inteiro o 2º colchete ( linha ) até o final

 */

public class Aula08ArraysMultidimensionais01 {

    public static void main(String[] args) {
        // 1, 3, 2, 5.... meses
        // 29, 31, 30.... dias
        int [][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 27;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 27;
        dias[1][2] = 31;

        for(int i = 0; i < dias.length; i++ ) { // esse dia.length representa o 1º colchete ( coluna )

            for(int j = 0 ; i < dias[i].length; j++ ){ // esse dia[0].length representa o 2º colchete ( linha )

                System.out.println(dias[i][j]);
            }

        }

        // Foreach

        for(int[] arrBase : dias){

            for(int num : arrBase){

                System.out.println(num);
            }
        }
    }
}
