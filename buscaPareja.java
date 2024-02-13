import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class buscaPareja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        parejas();
    }


    public static void parejas() {
        Scanner in = new Scanner(System.in);
        //array parejas
        String[] arrayParejas = new String[20];
        //arra posiciones
        int[] PosicionesAnimales = new int[20];

        String[] animales = {"León", "halcón", "cocodrilo", "tiburón", "elefante",
                "tigre", "perro", "gato", "serpiente", "paloma"};
        Random random = new Random();
        int posicionElegidaJugador = in.nextInt();
        int posicionElegidaJugador2 = in.nextInt();
        
        boolean posicionAnimales = false;
        //bucle de las parejas
        for (int i = 0; i < 20; i++) {
            arrayParejas[i] = animales[i % animales.length];
          
        }
       

        //esto imprime el array del String
       /* for (String animal : arrayParejas) {
            System.out.println(animal);*/
        }
    }

//}
