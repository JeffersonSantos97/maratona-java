package academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.dominio.Seminario;

public class SeminarioTest01 {

    public static void main(String[] args) {

        // criei um professor
        Professor professor1 = new Professor("Claudio");
        Professor professor2 = new Professor("Fernanada");

        // Criei alunos
        Aluno aluno1 = new Aluno("Jefferson");
        Aluno aluno2 = new Aluno("Gustavo");
        Aluno aluno3 = new Aluno("Beatriz");
        Aluno aluno4 = new Aluno("Maxwell");
        Aluno aluno5 = new Aluno("Anny");
        Aluno aluno6 = new Aluno("Fernando");

        // array de Alunos que vão pro semiario de matematica
        Aluno[] alunosMatematica = {aluno1, aluno2, aluno3};

        // Local
        Local local1 = new Local("Rua Clara maria da Gloria");
        Local local2 = new Local("Travessa Riachuelo");

        // criei os seminarios

        Seminario seminario1 = new Seminario("Matematica Quantica");
        Seminario seminario2 = new Seminario("O Saber não sabendo");

        // escolhendo o professor para o seminario 1
        seminario1.setProfessor(professor1);

        // Local do seminario 1
        seminario1.setLocal(local1);

        // alunos do seminario1
        seminario1.setAlunos(alunosMatematica);

        // imprimir o seminario1
        System.out.println("============ Seminario1 ============= ");
        seminario1.imprime();


        // SEMINARIO 2 ( não tem alunos )

        // escolhendo o professor pro seminario 2
        seminario2.setProfessor(professor2);

        // escolher local do seminario 2
        seminario2.setLocal(local1); // mesma rua que o seminario 2

        // imprimir seminario 2

        System.out.println("================== Seminario 2 ============= ");
        seminario2.imprime();









    }
}
