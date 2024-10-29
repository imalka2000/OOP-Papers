package Q3;

public class DemoThreads {
    public static void main(String[] args) {
        DemoThreads demoThread = new DemoThreads();
        
        Thread addNumbers = new Thread(new AddNumbers(demoThread, 10, 20), "ADD");
        Thread multiplyNumbers = new Thread(new MultiplyNumbers(demoThread, 10, 20), "MUL");
        
        addNumbers.start();
        multiplyNumbers.start();
    }
}