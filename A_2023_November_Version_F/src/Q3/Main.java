package Q3;

public class Main {
    public static void main(String[] args) 
    {
        int totalResources = 3;
        int totalUsers = 5;
        ResourceManager resourceManager = new ResourceManager(totalResources);

        for (int i = 1; i <= totalUsers; i++) {
            User userThread = new User(i, resourceManager);
            userThread.start();
        }
    }
}
