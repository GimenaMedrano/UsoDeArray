import java.util.Random;
import java.util.Scanner;

public class Array100 {

    public static  void NumerosArray(){//Crear un arreglo de 100 elementos, donde el primer elemento es 1, el segundo 2, el tercero 3 y así sucesivamente hasta el 100. Mostrar los elementos del arreglo y su promedio.

        int[] num = new int[100];   // Declarar un arreglo de 100 elementos de tipo entero
        double promedio = 0;
        int suma = 0;

        // Asignar valores del 1 al 100 al arreglo num y calcular la suma
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            suma += num[i];
        }

        // Imprimir los números del 1 al 100
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // Calcular el promedio
        promedio = (double) suma / num.length;
        System.out.println("El promedio es: " + promedio);

    }

    public static void NumerosArray2(){//Leer 10 números enteros, almacenarlos en un arreglo y mostrar el promedio de los números que son mayores o iguales a 5

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo:");
        int tamanio = sc.nextInt();
        int[] num = new int[tamanio];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese el valor del arreglo en la posición " + i + " (únicamente valores del 0 al 10):");
            int numero = sc.nextInt();

            while (numero < 0 || numero > 10) {
                System.out.println("El valor ingresado no es correcto, posición " + i + " (únicamente valores del 0 al 10):");
                numero = sc.nextInt();
            }
            num[i] = numero;
        }

        System.out.println("Los valores del arreglo son:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public void NumerosAleatorios(){//Generar un arreglo de 10 elementos con números aleatorios entre 0 y 10

        int[] arreglo = new int[10];
        Random numeroAleatorio = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = numeroAleatorio.nextInt(11);//Genera un número aleatorio entre 0 y 100
        }
        System.out.println("\nLos valores del arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public void AbecedarioArray(){//Crear un arreglo de 10 elementos con letras del abecedario, luego imprimir las letras en orden inverso.
        System.out.println("\n El abecedario es:");

        char[] abecedario = new char[26];

        for (int i = 0; i < abecedario.length; i++) {

            abecedario[i] = (char) ('A' + i);
        }

        for (char c : abecedario) {
            System.out.println(Character.toUpperCase(c));//Imprime el abecedario en mayúsculas
        }
    }





}
