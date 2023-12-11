import java.util.Scanner;
public class MyArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 = {1, 2, 3, 4, 5};
        array1[0]=7;
        array1[1]=5;
        array1[2]=78;
        array1[3]=99;
        array1[4]=2;


    imprimirArray(array1);
        System.out.println("***********************");
    maximoArray(array1);
        System.out.println("El array maximo es : "+ maximoArray(array1)  );
        System.out.println("***************************");
        System.out.println("el array minimo es : " + minimoArray(array1));
        System.out.println("***************************");
        System.out.println("la media de los arrays es : " + mediaArray(array1));
        }

        public static void imprimirArray(int[]array){
            System.out.println();
            for (int i = 0; i < array.length ; i++) {
                System.out.println(array[i]);

            }
        }
    public static int maximoArray(int[]array){
        System.out.println();
       int maximo= array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > maximo) {
                maximo=array[i];

            }
            System.out.println(array[i]);

        }return maximo;

}
    public static int minimoArray(int[]array){
        System.out.println();
        int minimo= array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < minimo) {
                minimo=array[i];

            }
            System.out.println(array[i]);

        }return minimo;

    }
    public static int mediaArray(int[]array){
        System.out.println();
        int suma=0;

        for (int i = 0; i < array.length ; i++) {


        }
        int media= suma/array.length;
        return media;
    }

}




