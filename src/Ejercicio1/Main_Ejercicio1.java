package Ejercicio1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main_Ejercicio1 {
    public static void main(String[] args) throws InterruptedException {
        /*
    1. a)Se pretende crear un programa en Java que simule una carrera entre una
    tortuga y un conejo. Hay que tener en cuenta que la distancia de la carrera
    es de 10 metros y el conejo recorre cada metro en 1 segundo y la tortuga en
    5 segundos.*/

        Ejercicio1.Conejo conejo = new Ejercicio1.Conejo("Ejercicio1.Conejo");
        Ejercicio1.Tortuga tortuga = new Ejercicio1.Tortuga("Ejercicio1.Tortuga");
        //tortuga.start();
        //conejo.start();

    /*
    1. b) Indica qué instrucción tendrías que usar en el programa anterior para que
    el conejo comenzara la carrera cuando la tortuga haya llegado a la meta, y
    dónde tendrías que colocar dicha instrucción.*/
    //Añado los join para que el conejo no comience la carrera hasta que la tortuga
    // haya llegado a la meta.
      tortuga.start();
        tortuga.join();
        conejo.start();
        conejo.join();
    }
}