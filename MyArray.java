import java.util.Scanner;
public class MyArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array;
        array = new int[]{0, 1, 2, 3, 4, 123};
        System.out.println(array[5]);

        System.out.println(maximoArray());
        System.out.println(minimoArray());
        System.out.println(mediaArray());
        System.out.println(sonIguales());
        System.out.println(sumaVectores());
        System.out.println(restaVectores());

    }

    public static int maximoArray() {

        Scanner in = new Scanner(System.in);
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

        Scanner in = new Scanner(System.in);
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
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 5 numeros para saber la media entre ellos");
        int[] numIntroducido;
        numIntroducido = new int[5];


        for (int i = 0; i < numIntroducido.length; i++) {
            numIntroducido[i] = in.nextInt();
        }
        int sumaNumeros = numIntroducido[0] + numIntroducido[1] + numIntroducido[2] + numIntroducido[3] + numIntroducido[4] ;
        int media = sumaNumeros / 5;
        System.out.println("La media es:");
        return media;
    }
    public static boolean sonIguales() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 3 numeros para saber si existen en el programa del 1 al 100");
        int[] array;
        array = new int[3];
        int[] array2;
        array2 = new int[]{2, 78, 93};
        boolean coincide = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i <array2.length; i++) {
            if (array == array2) {
                coincide=true;
                System.out.println("Felicidades el numero coincide" );
                    break;
            } else {
                coincide=false;
                System.out.println("No coincide");
            }

        }
        return coincide;
    }
            public static int sumaVectores(){
                int[]vector1={1,2,3,4};
                int sumaVector=vector1[0]+vector1[2];
                System.out.println("esta es la suma " + sumaVector);
                return sumaVector;
            }
    public static int restaVectores(){
        int[]vector1={1,2,3,4};
        int restaVector=vector1[0]-vector1[2];
        System.out.println("esta es la suma " + restaVector);
        return restaVector;
    }

    }






