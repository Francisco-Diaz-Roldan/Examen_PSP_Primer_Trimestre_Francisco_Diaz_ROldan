package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main_Ejercicio3 {
    public static void main(String[] args) throws InterruptedException {
    /*3. Escribir un programa que utilice Threads, al cual se le proporcione como
    entrada un array de tamaño aleatorio de números enteros (entre el 1 y el 100),
    y que nos devuelva un array con los números pares de ese array ordenados de
    menor a mayor.*/
         List<Integer> lista = new ArrayList<>();
         Nodo.addRandom(new Random(), lista);

         Nodo nodo = new Nodo(lista);
         nodo.start();
         System.out.println("Array generado de forma aleatoria:");
         Nodo.mostrarLista(nodo.getLista());
         nodo.join();
         System.out.println();
         System.out.println("Array de números pares ordenados de menor a mayor:");
         Nodo.mostrarListaPares(nodo.getLista());
    }
}