// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class MyArray {
    //Variable Global que se puede usar en varias funciones sin errores.
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        int[] array;
        array = new int[]{230, 144, 122, 33, 44, 123};

        int[] array1;
        array1 = new int[]{230, 144, 122, 33, 44, 123};

        int[] array2;
        array2 = new int[]{230, 144, 122, 33, 44, 123};
        /*
        imprimirArray(array);

        System.out.println(maximoArray());
        System.out.println(minimoArray());
        System.out.println(mediaArray());

        boolean esIgual = sonIguales();
        if (esIgual == true) {
            System.out.println("El numero es igual");
        } else {
            System.out.println("No coincide");
        }

        int[] resultadoVectoresSuma = sumaVectores();
        for (int i = 0; i < resultadoVectoresSuma.length; i++) {
            System.out.println(resultadoVectoresSuma[i]);
        }

        System.out.println(sonIguales());
        System.out.println(sumaVectores());
        System.out.println(restaVectores());
        System.out.println(invertirArray());

         */
        //maximoArrayPorParametro(array);
        invertirArray();//Funcion valor fijo
        invertirArrayParametro(array);//Procedimiento podemos cambiar los valores
        invertirArrayParametro(array1);
        invertirArrayParametro(array2);

    }

    public static void imprimirArray(int[] arrayIntroducido) {
        //i=0 ; i <= 5
        for (int i = 0; i <= arrayIntroducido.length - 1; i++) {
            System.out.println(arrayIntroducido[i]);
        }
    }

    public static int maximoArrayPorParametro(int[] arrayIntroducidoPorParametro) {

        int maximo = arrayIntroducidoPorParametro[0];  // Asigna el primer elemento como máximo inicial

        for (int i = 0; i < arrayIntroducidoPorParametro.length; i++) {
            if (arrayIntroducidoPorParametro[i] > maximo) {
                maximo = arrayIntroducidoPorParametro[i];
            }
        }

        System.out.println("El máximo entre ellos es :");
        return maximo;
    }

    public static int maximoArray() {
        System.out.println("Introduce 5 numeros para saber cual es el maximo entre ellos");
        int[] numIntroducido;
        numIntroducido = new int[5];
        for (int i = 0; i < numIntroducido.length; i++) {
            numIntroducido[i] = in.nextInt();

        }

        int maximo = numIntroducido[0];  // Asigna el primer elemento como máximo inicial

        for (int i = 1; i < numIntroducido.length; i++) {
            if (numIntroducido[i] > maximo) {
                maximo = numIntroducido[i];
            }
        }
        System.out.println("El máximo entre ellos es :");
        return maximo;

    }

    public static int minimoArray() {
        System.out.println("Introduce 5 numeros para saber cual es el minimo entre ellos");
        int[] numIntroducido;
        numIntroducido = new int[5];
        for (int i = 0; i < numIntroducido.length; i++) {
            numIntroducido[i] = in.nextInt();

        }

        int minimo = numIntroducido[0];  // Asigna el primer elemento como máximo inicial

        for (int i = 1; i < numIntroducido.length; i++) {
            if (numIntroducido[i] < minimo) {
                minimo = numIntroducido[i];
            }
        }
        System.out.println("El menor entre ellos es :");
        return minimo;
    }

    public static int mediaArray() {
        System.out.println("Introduce 5 numeros para saber la media entre ellos");
        int[] numIntroducido = new int[5];

        //Para Añadir valores a mi array
        for (int i = 0; i < numIntroducido.length; i++) {
            numIntroducido[i] = in.nextInt();
        }

        int sumaNumeros = numIntroducido[0] + numIntroducido[1] + numIntroducido[2] + numIntroducido[3] + numIntroducido[4];
        int media = sumaNumeros / 5;

        int suma = 0;
        //Acumulando la suma de todos los numeros de mi array
        for (int i = 0; i < numIntroducido.length; i++) {
            //
            suma += numIntroducido[i];
        }
        double media1 = suma / (numIntroducido.length - 1);

        System.out.println("La media es:" + media1);
        return media;
    }

    public static boolean sonIguales() {
        System.out.println("Introduce 3 numeros para saber si existen en el programa del 1 al 10");
        int[] array = new int[3];
        int[] array2 = new int[]{2};
        boolean coincide = false;

        //Array para que la persona Introduzca 3 numeros
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] == array2[0]) {
                coincide = true;
                break;
            } else {
                coincide = false;
            }

        }
        return coincide;
    }

    public static int[] sumaVectores() {
        int[] vector1 = {1, 6, 9, 7};
        int[] vector7 = {6, 5, 4, 3};
        //for
        //resultado tiene que tener esto: 7,7,7,7
        int[] resultado = new int[4];
        System.out.println("esta es la suma " + vector1[0] + " + " + vector1[2]);

        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] + vector7[i];
        }
        return resultado;
    }

    public static int restaVectores() {
        int[] vector1 = {1, 2, 3, 4};
        int restaVector = vector1[3] - vector1[2];
        System.out.println("esta es la resta " + vector1[3] + "-" + vector1[2]);

        /*asi es como se imprime un array
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]+"");*/

        return restaVector;
    }

    public static void invertirArray() {

        int[] array = {11, 12, 13, 14, 15, 16};
        int[] arrayInvertido = new int[6];//Esta lleno de 0
        int longitud = array.length-1;

        for (int i = longitud, j=0 ; i >= 0  ; i--, j++) {
            //Sout para ver que tiene el array, lo dejamos comentado porque ya hemos comprobado
            //que recorremos del ultimo
            //System.out.println(array[i]);
            //La variable J del for va servir para recorrer mi  ARRAYAUXILIAR del principio al final
            arrayInvertido[j] = array[i];
        }

        //PARA MOSTRAR POR ORDEN MIS DOS ARRAYS
        for (int i = 0; i < 6 ; i++) {
            System.out.println("Array Normal "+array[i]);
            System.out.println("Array Invertido "+arrayInvertido[i]);

        }
    }
    private static int[] invertirArrayParametro(int[] pepe) {
        //Ponemos el array.lengt porque mi auxiliar va a tener el mismo tamaño que el array
        //que le pasamos por parametro.
        int[] arrayInvertido = new int[pepe.length];
        int longitud = pepe.length-1;

        for (int i = longitud, j=0 ; i >= 0  ; i--, j++) {
            //Sout para ver que tiene el array, lo dejamos comentado porque ya hemos comprobado
            //que recorremos del ultimo
            //System.out.println(array[i]);
            //La variable J del for va servir para recorrer mi  ARRAYAUXILIAR del principio al final
            arrayInvertido[j] = pepe[i];
        }

        //MOSTRAR POR ORDEN MIS DOS ARRAYS
        for (int i = 0; i < 6 ; i++) {
            System.out.println("Array Normal "+pepe[i]);
            System.out.println("Array Invertido "+arrayInvertido[i]);

        }

        return arrayInvertido;
    }
}