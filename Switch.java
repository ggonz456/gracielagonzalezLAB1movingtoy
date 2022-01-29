/**
 * 
 */
package movingtoylab1;

/**
 * @author Gracielena_home
 *
 */
public class Switch {
	// atrributes

	private String shape;
	private int operationMode; // stop = 0 sing = 1 move = 2

	// Constructor
	public Switch(String shape) {
		this.shape = shape;
		this.operationMode = 0; // default mode is stop
	}

	/**
	 * Sets the mode of the toy
	 * @param operationMode
	 */
	public void selectOperationMode(int operationMode) {

		switch (operationMode) {
		case 1:
			System.out.println("Switch made me singing happy life moved to operation mode sing " + operationMode); // **sing
			break;
		case 2:
			System.out.println("Switch made me moving around: moving to operation mode move " + operationMode);// **move
			break;
		case 0:
		default:
			System.out.println(" Switch I'm Stopped " + operationMode);
			break;
		}
	}

	public int getOperationMode() {
		return operationMode;
	}

}
