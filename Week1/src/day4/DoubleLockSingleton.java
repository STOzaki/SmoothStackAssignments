package day4;

public class DoubleLockSingleton {
	private static volatile DoubleLockSingleton _instance;
	
	public static DoubleLockSingleton getInstance() {
		if(_instance == null) {
			synchronized(LazySingleton.class) {
				if(_instance == null) {
					_instance = new DoubleLockSingleton();
				}
			}
		}
		return _instance;
	}
}
