/**
 * 
 */
package movingtoylab1;

/**
 * @author Gracielena_home
 *
 */
public class SingSensor {
	
	//**attributes
	    
	public String material;
	public int musictape;
	public int amplifiercapacity;
	
	//** This is the constructor
	
	 public  SingSensor (String material, int musictape, int amplifiercapacity) 
	   {
		    this.material= material;
		    this.musictape= musictape;
		    this.amplifiercapacity=amplifiercapacity;
		   
	   }
	//Methods
	   public boolean stopsing() {
		   
		   System.out.println("Stop sing signal from my Sign sensor");
    	   
    	   return false;
         }
       
        public boolean startsing() {
        	  System.out.println("Start sing signal from my Sign sensor");
    	   
    	   return false;
         }
       
}
