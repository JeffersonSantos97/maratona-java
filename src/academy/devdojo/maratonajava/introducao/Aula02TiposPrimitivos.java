
// os tipos de Primitivos são

// byte, short, int, long, float, double, boolean, char

// ( float ) tem que colocar um f no final
// ex: float a = 3.5f

// ( long )  tem que colocar um ( l ) pra poder diferenciar do int
// ex: long b = 2152145255l

// ( char ) tem um caractere e deve ser entre ( ' ' )

// boolean sou é true ou é falso

// Inferencia ( var ) quando vc coloca  o var na frente da variável, ela sabe o tipo pelo q vc coloca
// ex var nome = "jefferson"; // não precisei colocar String, pois o var já fez a inferencia que era uma String

// Casting é forçar uma variável pro tipo que vc quer colocando o tipo e um parentese na frente
// ex: long numeroGrande = ( long ) 256.05;




package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {

        byte bt = 127;
        short sh = 368;
        int it = 1234454;
        long lg = 1234544464464645L;

        // com virgula

        double db = 26.6;

        float ft = 29.7f;

        // char e boolean

        char ch = 'A';

        boolean blVerdadeiro = true;
        boolean blFalso = false;

        // casting

        int numeroGrande = ( int ) 256.48;

        System.out.println(numeroGrande);





    }
}
