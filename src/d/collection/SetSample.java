package d.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		SetSample sample = new SetSample();
		String[]cars = new String[] {
				"Tico", "Sonant", "BMW", "Benz",
				"Lexus", "Mustang", "Grandeure",
				"The Beetle", "Mini Cooper", "i30",
				"BMW", "Lexus", "Carnibal", "SM5",
				"SM7", "SM3", "Tico"
		};
		System.out.println(sample.getCarkinds(cars));
		
	}
	public int getCarkinds(String[] cars) {
		if(cars == null) return 0;
		if(cars.length==1) return 1;
		Set<String> carSet = new HashSet<String>();
		for (String car : cars) {
			carSet.add(car);
		}
//		printCarSet(carSet);
		printCarSet2(carSet);
		return carSet.size();
	}
	public void printCarSet(Set<String> carSet) {
		for (String temp : carSet) {
			System.out.print(temp + " ");
		}
	}
	public void printCarSet2(Set<String> carSet) {
		Iterator<String> iterator = carSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

}
