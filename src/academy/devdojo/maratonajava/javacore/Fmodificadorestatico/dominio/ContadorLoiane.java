package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class ContadorLoiane {

    public static int objeto;

    public static void zerar(){

        ContadorLoiane.objeto = 0;
    }

    public static void incremetar(){

        ContadorLoiane.objeto++;
    }

    public static void retornar(){

        System.out.println(ContadorLoiane.objeto);

    }
}
