import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numeros={4,8,12,10};
        int suma=0;

        for (int j = 0; j < numeros.length; j++) {
            suma=numeros[j];
        }
        System.out.println("Suma total: " + suma);


        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }


        //Ejercicio alumno
        //buscar el numero mayor en un arreglo

        int[] valores={15,8,40,22,9};
        int mayor=0;

        for (int i = 0; i <valores.length ; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
        }
        System.out.println("el numero mayor del arreglo es: "+ mayor);

        //Sumar numeros hasta que el usuario escriba el cero.

        Scanner sc = new Scanner(System.in);
        int n=1;
        int sum=0;

        while (n != 0) {
            System.out.print("Ingrese un número a sumar: ");
            n = sc.nextInt();
            sum += n;
        }
        System.out.println("La suma total es: " + sum);

    }

}

