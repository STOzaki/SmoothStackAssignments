package test;
//import java.util.HashMap; 
//import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SLF4JTrial {
	private Logger logger;

	public SLF4JTrial() {
		logger = LoggerFactory.getLogger(SLF4JTrial.class);
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
	
	public static void main(String[] args) {
//		Map<Character, Integer> map = new HashMap<>();
//		Object a = new Object();
//		a.
		SLF4JTrial trial = new SLF4JTrial();
		trial.infoTest();
		trial.warningTest();
		trial.errorTest();
	}
}
