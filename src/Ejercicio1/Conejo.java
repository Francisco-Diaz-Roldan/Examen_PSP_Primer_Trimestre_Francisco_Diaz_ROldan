package Ejercicio1;

public class Conejo extends Thread{
    private String metrosRecorridosConejo;

    public Conejo(String metrosRecorridosConejo) {
        this.metrosRecorridosConejo = metrosRecorridosConejo;
    }

    @Override
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Ejercicio1.Conejo : Metro "+ i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}