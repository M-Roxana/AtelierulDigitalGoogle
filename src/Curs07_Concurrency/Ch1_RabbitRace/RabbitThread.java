package Curs07_Concurrency.Ch1_RabbitRace;

public class RabbitThread extends Thread{

    private int nr;
    public RabbitThread( int nr){
        this.nr=nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit #"+nr+"is running from Thread");
    }
}
