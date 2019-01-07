package chapter03;

public class Singleton {
	private static Singleton instance;
	//static 붙여야 접근가능
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}
