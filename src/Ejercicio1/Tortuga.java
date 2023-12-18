package Ejercicio1;

public class Tortuga extends Thread{
    private String metrosRecorridosTortuga;

    public Tortuga(String metrosRecorridosTortuga) {
        this.metrosRecorridosTortuga = metrosRecorridosTortuga;
    }

    @Override
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Ejercicio1.Tortuga : Metro "+ i );
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}