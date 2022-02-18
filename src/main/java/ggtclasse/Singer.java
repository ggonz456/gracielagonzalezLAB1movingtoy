package ggtclasse;
import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Singer extends ListenElements implements SelfCheckCapable{

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Singer";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.7);
	}

}
