package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Fruta;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Hortifruti;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Legume;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Verdura;

public class HortifrutiTest01 {

    public static void main(String[] args) {
        Fruta fruta1 = new Fruta("Laranja");
        Fruta fruta2 = new Fruta("Morango");
        Fruta[] frutas = {fruta1, fruta2};

        Legume legume1 = new Legume("Beterraba");
        Legume[] legumes = {legume1};

        Verdura verdura1 = new Verdura("Alface");
        Verdura[] verduras = {verdura1};

        Hortifruti hortifruti = new Hortifruti("Vai pra mente");

        hortifruti.setFrutas(frutas);
        hortifruti.setLegumes(legumes);
        hortifruti.setVerduras(verduras);

        hortifruti.imprimeNome();






    }

}
