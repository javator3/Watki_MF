package pl.sda.watki;

public class RunnerZadanie extends Thread{

    @Override
    public void run(){
        int parametr = 10;
        System.out.println("Wynik: " + 2*parametr);

    }

}
