import java.util.Scanner;

public class wifiHotel {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        señalHotel();
    }
    public static void señalHotel(){
        int[] array = new int[20];
        System.out.println("Elige una habitacion para instalar el router");
        int posicionEligida=4;
        int potenciaRouter=6;
        int posicionQueNosDicelaPersona = in.nextInt(); //Usuraio mete la posicion del 1 al 20
        posicionQueNosDicelaPersona = posicionQueNosDicelaPersona - 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        array[posicionEligida]=4;

        for (int i = posicionQueNosDicelaPersona; i < array.length; potenciaRouter--) {
            System.out.println(potenciaRouter);
        }

    }

}
