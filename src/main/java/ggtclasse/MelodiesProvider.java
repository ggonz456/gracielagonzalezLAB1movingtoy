/**
 * 
 */
package ggtclasse;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author Gracielena_home
 *
 */
public class MelodiesProvider implements SelfCheckCapable{

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Melodies Provider";
				
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return  SelfCheckUtils.randomCheck(0.8);
	}

}
