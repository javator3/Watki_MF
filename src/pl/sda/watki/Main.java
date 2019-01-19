package pl.sda.watki;

class Runner implements  Runnable{


    @Override
    public void run() {

        for (int i =0; i < 10; i++){
            System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
//        Thread thread = new Thread(new Runner()); // wywołanie polimorficzne, przyjmuje typ Runnable i jest akceptowany gdyż nasza klasa Runner ją implementuje
//        Thread thread1 = new Thread(new Runner());
//        thread.start();
//        thread1.start();

        RunnerExample runnerExample = new RunnerExample();
        RunnerExample runnerExample2 = new RunnerExample();
        runnerExample.start();
        runnerExample2.start();

        Thread thread = new Thread(new Runnable(){
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());
            }
        }
        });

        thread.start();;

        RunnerZadanie runnerZadanie = new RunnerZadanie();
        RunnerZadanie runnerZadanie1 = new RunnerZadanie();
        runnerZadanie.start();
        runnerZadanie1.start();
    }
}
