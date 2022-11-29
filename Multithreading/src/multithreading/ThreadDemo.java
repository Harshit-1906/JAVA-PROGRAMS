
package multithreading;

public class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("thread is running ");
    }
    
    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo();
        Thread th=new Thread(t1);
        th.start();
    }
    
}
