package academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.dominio.Anime;

public class AnimeTest {

    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Mangá", 12, "Naruto","Ação");
        anime.imprime();


    }
}
