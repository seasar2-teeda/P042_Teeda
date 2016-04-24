package tutorial.chura.web.add;

public class AddPage {
	
	public Integer arg1;
	public Integer arg2;
	public Integer result;

	public Class<?> doCalculate() {
		result = arg1 + arg2;
		return null;
	}

	public Class<?> initialize() {
		return null;
	}

	public Class<?> prerender() {
		return null;
	}

}
