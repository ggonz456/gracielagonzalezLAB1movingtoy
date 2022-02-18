/**
 * 
 */
package ggtclasse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Gracielena_home
 * This is my main class  delete this before sent echoSpeaker for him
 * Creating the constructor and addign all the elements
 *  that comunicates with RepeaterSinger we are creating the interface
 */

public class RepeaterSinger implements GenericComponent {
	//**attributes
	
	@SuppressWarnings("unused")
	private String model;
	private Object myMicrophone;
	private Singer mySinger;
	private InternetSupplier myInternetSupplier;
	private EndListener myEndListener;
	
	////** this is the constructor thata communicates al elements that 
	public RepeaterSinger() {
		myMicrophone= new Microphone();
		mySinger = new Singer();
		myInternetSupplier= new InternetSupplier();
		myEndListener = new EndListener();
	 	}
	
	
	
	/**
	 * #param args
	 */
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
	}



	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "RepeaterSinger is a new Brand product in demo";
	}



	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myMicrophone,mySinger,myInternetSupplier,myEndListener); // add all your sub components
		return internalComponents;
	}

}
