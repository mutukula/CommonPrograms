package MultiThreading;

public class Threads1 extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Threads1 t = new Threads1();
        t.start();
        t.getPriority();
    }
}
