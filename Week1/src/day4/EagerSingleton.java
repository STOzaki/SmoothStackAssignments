package day4;

public class EagerSingleton {
	// this will create an instance everything this class is referenced
	private static final EagerSingleton EagerInstance = new EagerSingleton();
	
	private EagerSingleton() {
	}
	
//	private static volatile LazySingleton _instance;
	
	public static EagerSingleton getEagerSingleton() {
		return EagerInstance;
	}
}
