package singleton;

public class Ehanshi {
	
	private static Ehanshi l = new Ehanshi();
	
	private Ehanshi() {}
	
	public static Ehanshi getInstance() {
		
		return l;
	}

}
