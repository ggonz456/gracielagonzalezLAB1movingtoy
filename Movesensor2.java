/**
 * 
 */
package movingtoylab1;

/**
 * @author Gracielena_home
 *
 */
public class Movesensor2 {
	
	//**attributes
	public String Material;
	public int movilityspeed;
	public int size;
	
	//** *This is the base  Constructor
	  
	 
	   public  Movesensor2 (String Material, int movilityspeed, int size) 
	   {
		    this.Material= Material;
		    this.movilityspeed= movilityspeed;
		    this.size=size;
		   
	   }
	   //**methods
	   
           public boolean stopmoving() {
        	   System.out.println(" my Move  sensor STOPPED");
        	   
        	   return false;
           }
           
            public boolean turnrigh() {
            	 System.out.println(" my Move sensor Turn Right");
        	   
        	   return false;
           }
            
            public boolean turnrleft() {
            	 System.out.println(" my Move sensor Turn Left");
         	   return false;
            }
            
            public boolean spin() {
            	 System.out.println(" my Move sensor spin I am dizzy");
          	   return false;
             }
            
            public boolean forward() {
            	 System.out.println(" my Move sensor Moving me forward");
           	   return false;
              }
            
            public boolean backward() {
            	 System.out.println(" my Move sensor is moving backward");
           	   return false;
              }
            
}
