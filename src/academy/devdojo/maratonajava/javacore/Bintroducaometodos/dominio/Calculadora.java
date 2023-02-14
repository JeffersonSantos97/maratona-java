package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;
/*
    Metodo VOID
    Se eu cortar uma maça, eu posso cortar essa maça e te devolver, mas posso também cortar essa maça e ficar pra mim
    no metodo VOID, eu corto essa maça e fico com ela pra mim

    Metodo de RETORNO e devolvo a maça cortada



    Parametros são variaveis que estaram vivas dentro do método

    se chama parametro quando está dentro do metodo, agora quando está  nessa classe, vc vai ter que passsar o
    argumento


    // varArgs...

     varArgs é a mesma coisa que um Array
     A diferenca entre eles é que no array eu tenho que criar um array e colocar essa variável de array
     como parametro.
     Já o ( VarArgs ) vc pode já criar o array sem passar por uma variável, passar o array direto
     como parametro dentro da instanicação do metodo


 */
public class Calculadora {

    public void somaDoisNumeros(){

        System.out.println(10 + 10 );
    }

    public void subtraiDoisNumeros(){

        System.out.println(20 - 10);
    }

    // metodo com parametro
    // obs: retorno desse metodo tá na classe CalculadoraTest02
    public void multiplicaDoisNumeros(int num1, int num2){

        System.out.println(num1 * num2 );
    }

    // metodo de retorno
    // ( o retorno está na class CalculadoraTest03
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {

            return 0;
        }

        return num1 / num2;
    }
        /* VarArgs  CalculadoraTest05*/

        public void somaArray(int[] numeros){
            int soma = 0;

            for(int numero : numeros) {

                soma += numero;
            }

            System.out.println(soma);

        }

        // fazendo com VarArgs

        public void somaVarArgs(int...numeros){

            int soma = 0;

            for(int numero : numeros){

                soma+= numero;
            }
        }
    }


