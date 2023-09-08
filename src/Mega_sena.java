import java.util.Random;

public class Mega_sena {

    public static void main(String[] args) {
        int i = 0;
        int number;
        Random gerador = new Random();

        while(i < 6){
            number = gerador.nextInt(60);
            System.out.println(number);
            i++;
        }
//        for(int i = 0; i < 6; i++){
//            number = gerador.nextInt(60);
//            System.out.println(number);
//        }

    }

}
