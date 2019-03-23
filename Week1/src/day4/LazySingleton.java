package day4;

public class LazySingleton {
	private static volatile LazySingleton _instance;
	
	public static LazySingleton getInstance() {
		if(_instance == null) {
			synchronized(LazySingleton.class) {
				if(_instance == null) {
					_instance = new LazySingleton();
				}
			}
		}
		return _instance;
	}
}
