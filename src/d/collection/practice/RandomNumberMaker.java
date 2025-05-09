package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
	Random random = new Random();

	public static void main(String[] args) {
		RandomNumberMaker sample = new RandomNumberMaker();
		sample.makeRandomNumber(10);
	}
	
	
	public void makeRandomNumber(int input) {
		for (int i = 0; i < input; i++) {
			HashSet<Integer> numberSet = getSixNumber();
			System.out.println(numberSet);
		}
		
		
	}
	
	public HashSet<Integer> getSixNumber(){
		HashSet<Integer> numberSet = new HashSet<Integer>();
		while(true) {
			int tempNumber = random.nextInt(44)+1;
			numberSet.add(tempNumber);
			if(numberSet.size()==6)
				break;
		}
		return numberSet;
	}
}
