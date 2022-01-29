/**
 * 
 */
package movingtoylab1;

/**
 * @author Gracielena_home
 *
 */
public class Lightsensor {
	
	//**Attributes
	
	  public String material;
	  public int  lummen;
	  public int Lux;
	  
	  //**Constructor
	  
	  public Lightsensor(String material,int  lummen,int Lux) 
	  {
		  this.material=material;
		  this.Lux=Lux;
		  this.lummen=lummen;
		  		  
	  }
	  
	  //Methods
	   
	  public boolean stopFLASHESLIGHT() {
			System.out.println("Stop Flashig my light sensor");

    	   return false;
	  }
      
	  
	  public boolean increaselight() {
		  System.out.println("Increasing light my light sensor");

   	   return false;
	  }
	  
	  
	  public boolean decreaselight() {
		  System.out.println("Decreasing light my light sensor");

	   	   return false;
		  }
	  
}
