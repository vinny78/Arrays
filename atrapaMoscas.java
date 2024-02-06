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
        //Vas a crear un array de 16 elemntos y tu ejercicio pide 15
        //int[] array = new int[16]; --> esto esta mal
        int[] array = new int[15];
        int longitudArray = array.length;
        int posicionVacia = 0;

        //SIRVE PARA SACAR LA POSICION DE LA MOSCA RAMDOM
        Random random = new Random();
        //Esto ESTARIA MAL PORQUE LA MOSCA SE VA A POSICIONAR DESDE LA POSCION 0 AL 14 que son
        //15 elementos contando el 0
        //int mosca = random.nextInt(1, 15);
        int mosca = random.nextInt(15);
        int numeroDedentro = 4;

        array[12]=numeroDedentro;

        //WHILE
        while (posicionMosca == false) {
        System.out.println("introduce una posicion");
        int posicionQueNosDicelaPersona = in.nextInt(); //Usuraio mete la posicion del 1 al 15
        posicionQueNosDicelaPersona = posicionQueNosDicelaPersona - 1; //Aqui restamos 1
        //Porque el array empieza 0 y termina en 14 no en 15 IMPORTANTE


            //Rellenamos el array con ceros.
            for (int i = 0; i < array.length; i++) {
                array[i] = 0;
            }

            System.out.println(mosca);
            array[mosca] = 7;
            if (posicionQueNosDicelaPersona == mosca) {
                System.out.println("has ganado has atrapado la mosca");
                posicionMosca = true;
            } else if (posicionQueNosDicelaPersona == (mosca - 1) || posicionQueNosDicelaPersona == (mosca + 1)) {
                System.out.println("La mosca se ha movido");
                mosca = random.nextInt(15);
                System.out.println("lA MOSCA SE MUEVE PORQUE ESTAS CERCA, NUEVA POSICION "+mosca);
            } else if (posicionQueNosDicelaPersona != mosca) {
                System.out.println("Has fallado prueba otra vez");

            }//Cierre del else if

        for (int i = 0; i < array.length; i++) {
            System.out.print("| "+array[i]+" | ");
            System.out.println("");


        }
        }//CIERRE DEL WHILE
    }//Cierre de la funcion

}