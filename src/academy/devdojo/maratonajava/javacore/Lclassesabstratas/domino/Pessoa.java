package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domino;

// o metodo pessoa é pai do metodo Funcionario e avô dos métodos Gerente, Desenvolvedor e AGG

//
public abstract class Pessoa {

    // metodo abstrato em Pessoa se estende pras classes filhas e netas, mas o metodo deve ser só obrigatoriamente

    // executado na classe concreta

    // ou seja, para sanar o erro, eu devo sobscrever o metodo abstrato imprime() nas classes Gerente, Desenvolvedor e ASG

    // obs: se eu quiser sobscrever o metodo abstrato na classe filha, eu também posso
    // prevalece a hierarquia, mas não é obrigatorio.
    // A obrigação é na classe concreta
   public abstract void imprime();
}
