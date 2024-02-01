import java.util.Random;
import java.util.Scanner;
public class atrapaMoscas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        atrapamosca();
    }

    public static void atrapamosca() {
        Scanner in = new Scanner(System.in);
        boolean posicionMosca = false;
        int[] eleccionPosicion = new int[1];
        int[] array = new int[16];
        int longitudArray = array.length;
        int posicionVacia= 0;
        System.out.println("introduce una posicion");

        for (int i = 0; i < eleccionPosicion.length; i++) {
            eleccionPosicion[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]=0);
            }
        Random random=new Random();
        int movimientoMosca = random.nextInt(1, 15);
        System.out.println(array[movimientoMosca]=7);

        }

}


