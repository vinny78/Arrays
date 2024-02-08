import java.util.Arrays;
import java.util.Scanner;

public class wifiHotel {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        señalHotel();

    }
    public static void señalHotel(){
        int[] array = new int[20];
        System.out.println("Elige una habitacion para instalar el router,1-20");
        int  posicionElegida= in.nextInt()-1;
        int potenciaRouter=3;
        int posicionInversa=posicionElegida;

        /*int posicionQueNosDicelaPersona = in.nextInt(); //Usuraio mete la posicion del 1 al 20
       posicionQueNosDicelaPersona = posicionQueNosDicelaPersona - 1;*/

        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
       // array[posicionEligida]=4; fallaba porque me ponia directamente en la posicion 4
        //System.out.println();


        for (int i = potenciaRouter; i > 0 ; i--) {
            array[posicionElegida]=i;
            posicionElegida++;

        }
        for (int i = potenciaRouter; i >0 ; i--) {
            array[posicionInversa]=i;
            posicionInversa--;
        }
        System.out.println(Arrays.toString(array));
    }

    }

