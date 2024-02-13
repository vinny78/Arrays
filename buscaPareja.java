import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class buscaPareja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
parejas();
    }


   public static void  parejas(){
       String []array=new String[20];
       String[] animales = {"León", "halcón", "cocodrilo", "tiburón", "elefante",
               "tigre", "perro", "gato", "serpiente", "paloma"};
       Random posicionAnimales= new Random();

       for (int i = 0; i < 20; i++) {
           array[i] = animales[i % animales.length];
       }


       /*for (String animal:array) {
           System.out.println(animal);*/
       }
   }

}
