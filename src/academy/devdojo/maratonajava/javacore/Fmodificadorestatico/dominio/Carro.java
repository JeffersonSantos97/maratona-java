package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;
// Static faz o atributo ser pertence a classe e não mais ao objeto
// todos os objetos vao receber o mesmo valor

// posso usar um metodo sem precisar criar umas instancia
// já uso o metodo direto da Classe
public class Carro {

    private String nome;
    private double velociadadeMaxima;
    public static  double velocidadeLimite = 250;

    public Carro(String nome, double velociadadeMaxima) {

        this.nome = nome;
        this.velociadadeMaxima = velociadadeMaxima;
    }

    public void imprime(){

        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println( "Velocidade Maxima: " +this.velociadadeMaxima);
        System.out.println( "Velocidade Limite: " +Carro.velocidadeLimite);
    }
    public String getNome(){

        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getVelociadadeMaxima(){

        return velociadadeMaxima;
    }

    public void setVelociadadeMaxima(double velociadadeMaxima) {

        this.velociadadeMaxima = velociadadeMaxima;
    }



}
