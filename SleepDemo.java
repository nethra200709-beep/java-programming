class SleepDemo extends Thread {

    public void run() {
        try {
            System.out.println("Thread going to sleep");
            Thread.sleep(3000);  
            System.out.println("Thread woke up");
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        SleepDemo s = new SleepDemo();
        s.start();
    }
}