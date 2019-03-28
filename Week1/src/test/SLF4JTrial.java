package test;
//import java.util.HashMap; 
//import java.util.Map;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.Level;

public class SLF4JTrial {
	private Logger logger;
	private int countApples;
	private String name;
	private final static Level defaultLevel = Level.DEBUG;

	public SLF4JTrial(int countApples, String name) {
		this.countApples = countApples;
		this.name = name;
		logger = (Logger) LoggerFactory.getLogger(SLF4JTrial.class);
		logger.setLevel(defaultLevel);
	}
	
	public void warningTest() {
		logger.warn("This is a WARNING");
	}
	
	public void infoTest() {
		logger.info("This is simply a info!");
	}
	
	public void errorTest() {
		logger.error("ERROR!");
	}
	
	public void debugTest() {
		logger.debug("Debugging");
	}
	
	public void specificError() {
		logger.debug("{} has {} apples", name, countApples);
	}
	
	
	public static void main(String[] args) {
//		Map<Character, Integer> map = new HashMap<>();
//		Object a = new Object();
//		a.
		SLF4JTrial trial = new SLF4JTrial(30, "Tom");
		trial.debugTest();
		trial.infoTest();
		trial.warningTest();
		trial.errorTest();
		trial.specificError();
	}
}
