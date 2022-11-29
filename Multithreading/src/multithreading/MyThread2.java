
package multithreading;

public class MyThread2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread()+" is running "+i);
        }
    }
    
    public static void main(String[] args) {
        MyThread2 th1=new MyThread2();
        MyThread2 th2=new  MyThread2();
        th1.start();
        th2.start();
        System.out.println(Thread.currentThread());
    }
 
           
    
}
