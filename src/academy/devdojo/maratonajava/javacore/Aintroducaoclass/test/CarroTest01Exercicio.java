package academy.devdojo.maratonajava.javacore.Aintroducaoclass.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclass.dominio.CarroExercicio;
/*
Uma variável de referencia pode fazer referencia a um mesmo objeto

 A Forma de fazer isso é colocar carro1 = carro2;
 é possivel também fazer ao contrário ( carro2 = carro1 )

 obs: Olhar o print pra entender melhor ainda



*/
public class CarroTest01Exercicio {

    public static void main(String[] args) {
        // criando dois objetos distintos

        CarroExercicio carro1 = new CarroExercicio();
        CarroExercicio carro2 = new CarroExercicio();

        carro1.nome = "Ferrari MFX-500";
        carro1.modelo = "Black power";
        carro1.ano = 2023;

        carro2.nome = "Jeep";
        carro2.modelo = "esrtada";
        carro2.ano = 2021;

        //  carro1 = carro2;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("===================");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);



    }
}
