
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread3 extends Thread{
     @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            
            try {
                System.out.println(Thread.currentThread()+" is running "+i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args) {
        MyThread3 t1=new MyThread3();
        MyThread3 t2=new MyThread3();
        MyThread3 t3=new MyThread3();
        t1.setName("Thread hally");
        t2.setName("thread dhruvi");
        t3.setName("thread ruhi");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getId());
        System.out.println(t2.isAlive());
        
        
    }
}
