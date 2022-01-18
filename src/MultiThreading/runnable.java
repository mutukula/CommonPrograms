package MultiThreading;

public class runnable implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Runnable r = new runnable();
        r.run();
    }
}
