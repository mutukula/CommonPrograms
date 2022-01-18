package MultiThreading;

public class Threads extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Threads t = new Threads();
        t.start();
    }
}
