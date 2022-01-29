package movingtoylab1;

/**
 * Class to represent moving toy
 * 
 * @author Gracielena_home
 *
 */

public class Walkingtoy {

	// *class attributes
	private String color;
	private String name;
	private String shape;
	
	public Buttonstart buttonStart;
	public Switch aSwitch;
    public Buttonnumbers buttonnumbers;
    public Buttontriangle buttontriangle;
    public Buttonletter buttonletter;
    public Buttonmusic buttonmusic;
    public Buttonheart buttonheart;
    public Wheels wheels;
    public Lightsensor lightsensor;
    public Movesensor2 movesensor2;
    public SingSensor singSensor;
	// ** *This is the base Constructor

	public Walkingtoy(String color, String name, String shape, Buttonstart buttonStart, Switch aSwitch,Buttonnumbers buttonnumbers, Buttonletter buttonletter,Buttonmusic buttonmusic,Buttonheart buttonheart,Buttontriangle buttontriangle,Wheels wheels,SingSensor singSensor,Lightsensor lightsensor,Movesensor2 movesensor2) {
		this.color = color;
		this.name = name;
		this.shape = shape;
		this.buttonStart = buttonStart;
		this.aSwitch = aSwitch;
		this.buttonnumbers= buttonnumbers;
		this.buttonletter=buttonletter;
		this.buttonmusic=buttonmusic;
		this.buttonheart=buttonheart;
		this.buttontriangle= buttontriangle;
		this.wheels=wheels;
		this.lightsensor= lightsensor;
		this.movesensor2=movesensor2;
		this.singSensor= singSensor;
	}


	

	// *Methods
	public String showcolornamepartnumber() {
		// show Color name and part number from constructor
		return " My walking toy has this characteristics " + this.color + " " + this.name + " " + this.shape;
	}

	/* If the toy is walking return true */
	public boolean walk() {
		return true;

	}

	/* If the toy is singing return true */
	public boolean sing() {
		return true;

	}

	/* If the tow is dancing return true */
	public boolean dance() {
		return true;

	}

	/* If the tow is turn when find an obstacle return true */
	public boolean changeatobstacle() {
		return true;

	}

	/* If the tow is able to flash lights return true */
	public boolean flasheslight() {
		return true;

	}

}
