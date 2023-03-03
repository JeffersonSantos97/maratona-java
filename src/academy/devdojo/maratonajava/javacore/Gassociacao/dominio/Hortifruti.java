package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Hortifruti {

    private String nome;
    private Legume[] legumes;
    private Fruta[] frutas;
    private Verdura[] verduras;

    public Hortifruti(String nome){

        this.nome = nome;
    }

    public void imprimeNome(){

        System.out.println(this.nome);
        if(legumes == null) return;
        for(Legume leg : legumes) {

            System.out.print(leg.getNome() + " ");
        }

        System.out.println();

        if(frutas == null ) return; // se em frutas não tiver nada, eu retorno vazio ( como se fosse um break )
        for(Fruta frut : frutas) {

            System.out.print(frut.getNome() + " ");
        }

        System.out.println();

        if(verduras == null ) return;

        for(Verdura verd : verduras) {

            System.out.print(verd.getNome() + " ");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Legume[] getLegumes() {
        return legumes;
    }

    public void setLegumes(Legume[] legumes) {
        this.legumes = legumes;
    }

    public Fruta[] getFrutas() {
        return frutas;
    }

    public void setFrutas(Fruta[] frutas) {
        this.frutas = frutas;
    }

    public Verdura[] getVerduras() {
        return verduras;
    }

    public void setVerduras(Verdura[] verduras) {
        this.verduras = verduras;
    }
}
