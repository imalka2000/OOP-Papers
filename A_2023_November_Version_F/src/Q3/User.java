package Q3;

class User extends Thread
{
	int userId;
    ResourceManager resourceManager;

    public User(int userId, ResourceManager resourceManager) {
        this.userId = userId;
        this.resourceManager = resourceManager;
    }

    @Override
    public void run() 
    {
        try {
            int resourceId = resourceManager.requestResource(userId);  // Request a resource
            Thread.sleep(1000);  // Simulate usage of resource
            resourceManager.releaseResource(userId, resourceId);  // Release the resource
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
