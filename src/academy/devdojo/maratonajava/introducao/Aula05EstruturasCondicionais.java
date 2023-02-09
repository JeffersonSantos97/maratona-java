package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {

    public static void main(String[] args) {

        for(int i = 0 ; i < 100000; i++ ){
            System.out.println(i);
            if( i >= 25) {

                break;
            }
        }
    }
}
