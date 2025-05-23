package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
	private final int DATA_BOUNDARY = 50;
	Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
	
	public static void main(String[] args) {
		RandomNumberStatistics sample = new RandomNumberStatistics();
		sample.getRandomNumberStatistics();
	}
	
	public void getRandomNumberStatistics() {
		Random random = new Random();
		int runcount = DATA_BOUNDARY * 100;
		for (int i = 0; i < runcount; i++) {
			int tempNumber = random.nextInt(DATA_BOUNDARY)+1;
			putCurrentNumber(tempNumber);
		}
		printStatistics();
	}
	public void putCurrentNumber(int tempNumber) {
		if(hashtable.containsKey(tempNumber)) {
			hashtable.put(tempNumber,hashtable.get(tempNumber)+1);
		}else{
			hashtable.put(tempNumber, 1);
		}
	}
	public void printStatistics() {
		Set<Integer> keySet = hashtable.keySet();
		for (Integer key : keySet) {
			int count = hashtable.get(key);
			System.out.print(key + "=" + count + "\t");
			if(key%10-1==0)
				System.out.println();
		}
	}

}
