package day20;
//Thread
//Smallest unit of process that performs a specific task
//Thread is a lightweight process
//Thread is a part of process
//Thread ->extends,thread class->run()
// -> implements,runnable interface->run()
//Thread class and Runnable interface are used to create a thread\
//run() method is used to define the task that the thread will perform
//start() method is used to start the thread
/*class SampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}
public class Threads {
    public static void main(String[] args) {
        SampleThread t1 = new SampleThread();
        t1.start();
    }
}
    */
public class Threads {
     public static void main(String[] args) {
        
        task1();
        task2();
    }
    static void task1(){
        for(int i=0;i<5;i++){
            System.out.println("From task1:"+i);
        }
    }
    static void task2(){
        for(int i=0;i<5;i++){
            System.out.println("From task2:"+i);
        }
    }
}
