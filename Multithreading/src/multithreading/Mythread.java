
package multithreading;

public class Mythread extends Thread{

    @Override
     public void run() {
         System.out.println("mythread is running "+Thread.currentThread());
       }
    
    public static void main(String[] args) {
        Mythread m1=new Mythread();
        m1.setName("thread 1");
        m1.start();
        System.out.println(Thread.currentThread());
        
    }
}
