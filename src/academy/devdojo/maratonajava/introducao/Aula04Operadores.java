package academy.devdojo.maratonajava.introducao;
/* OPERADORES ARITMETICOS
* ( + - / * )
*  no System.out.println( variavel + variavel ) retorna a soma das variáveis
   * Se tiver uma String na frente, ele concatena tudo
   *
*/

/* OPERADORES RELACIONAIS

* operador resto ( % ) == > retorna o resto de uma divisão

* ( 1. < / 2. > / 3. <= / 4. >= 5. == / 6. != )
// 1 - menor / 2 - maior / 3 - menor ou igual / 4 - maior ou igual / 5 - igual / 6 - diferente

// no boolean a comparação de 10.0 == 10 retorna true; Só não pode ser uma string
*/


public class Aula04Operadores {

    public static void main(String[] args) {
    int n1 = 10;
    int n2 = 20;

    // soma de duas string dentro do print
        System.out.println(n1 + n2 ); // 30
        System.out.println("Valor " + n1 + n2 ); // Valor 1020

    int soma = n1 + n2;
    int subtracao = n1 - n2;
    int multiplicacao = n1 * n2;
    int divisao = n1 / n2;

        System.out.println("Soma " + soma); // 30
        System.out.println("Subtracao " + subtracao); // -10
        System.out.println("Multiplicação " + multiplicacao); // 200
        System.out.println("Divisão " + divisao); // 0
        /*
            O correto da divisão de 10 / 20 é 0.5, mas numa divisão de dois numeros inteiros
            retorna um inteiro

            uma opção pra resolver isso é usar o Casting
            colcoar o ( double ) na frente

         */

        /*
          A diferenca de ++ na frente ou atrás, é o momento da execução da ação
          no primeiro, primeiro imprirme o valor, depois incrementa
         já no segundo eu incremento primeiro e depois imprimo

        */
        int contador = 0;

        System.out.println(contador++); // 0
        System.out.println(++contador); // 1

    }
}
