package Q3;

import java.util.ArrayList;
import java.util.List;

public class ResourceManager
{
	int totalResources;
	List<Integer> resources;
	
	public ResourceManager(int totalResources) 
	{
		super();
		this.totalResources = totalResources;
		resources=new ArrayList<Integer>();
		
		for (int i = 0; i < totalResources; i++) 
		{
            resources.add(i);  // Initialize the ArrayList with resource IDs
        }
	}
	
	public synchronized int requestResource(int userId) throws InterruptedException 
	{
		
		  while (resources.isEmpty())
		  {
			  	System.out.println("User " + userId + " is waiting for a resource.");
	            wait();  // Wait until a resource becomes available
	      }
	        int resourceId = resources.remove(0);  // Remove the first available resource
	        System.out.println("User " + userId + " acquires Resource " + resourceId);		
		
	        return resourceId;			
	}
	
	
	 public synchronized void releaseResource(int userId, int resourceId) 
	 {
	        resources.add(resourceId);  // Add the released resource back to the list
	        System.out.println("User " + userId + " releases Resource " + resourceId);
	        notifyAll();  // Notify waiting threads
	  }
	

}
