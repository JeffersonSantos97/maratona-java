package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;
/*
Palavra this serve pra referenciar algo que está dentro da própia classe


*/
public class Estudante02 {

    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("====================");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
