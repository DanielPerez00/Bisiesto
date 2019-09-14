import static java.lang.Integer.parseInt;

import java.util.concurrent.CountDownLatch;

public class Bisiesto {

    public static void main(String[] args) {

        int x = parseInt(args[0]);

        if(div(x) == 0){

            System.out.println("True");
        }

        else{
            System.out.println("False");
        }

    }

    private static int div(int x) {
        int resultado = 0;
        resultado = x%4;
        return resultado;
    }


}