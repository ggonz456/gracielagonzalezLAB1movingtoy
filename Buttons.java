/**
 * 
 */
package movingtoylab1;

/**
 * @author Gracielena_home
 *
 */
public abstract class Buttons {
	
	public String shape;
	public String color;
	public int Partnumber;
	public String Connecttech;
	public String FormFactors;
	
	
	/***this is the constructor
	 * @param Partnumber 
	 * 
	 * 
	 */
	public Buttons(String shape,String color , int partnumber,String FormFactors,String Connecttech, int Partnumber ) {
	      this.shape =shape;
	      this.color= color;
	      this.Partnumber=Partnumber;
	      this.Connecttech = Connecttech;
	      this.FormFactors =FormFactors;
	}
	
	public boolean ISconnectligthsensor() {
		
		return false;
	}
     public boolean Isconnectsingsensor() {
		
		return false;
	  }
     public boolean Isconnectmovingsensor() {
 		
 		return false;
 	  }
     
}
