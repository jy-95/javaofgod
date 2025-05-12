package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
	private final int DATA_BOUNDARY = 50;
	Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
	
	public static void main(String[] args) {

	}
	
	public void getRandomNumberStatistics() {
		for (int i = 0; i < 5000; i++) {
			Random random = new Random();
			int tempNumber = random.nextInt();
			putCurrentNumber(tempNumber);
			
		}
	}
	public void putCurrentNumber(int tempNumber) {
		
	}

}
