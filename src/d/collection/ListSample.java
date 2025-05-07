package d.collection;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		ListSample sample = new ListSample();
		sample.checkArrayList4();
	}
	public void checkArrayList1() {
		ArrayList<String> list = new ArrayList<String>();
	}
	public void checkArrayList2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "A1");
		
		for (String tempData : list) {
			System.out.println(tempData);
		}
	}
	
	public void checkArrayList3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "A1");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("0 ");
		list2.addAll(list);
		for (String tempData : list2) {
			System.out.println("List2 " + tempData);
		}
	}
	
	public void checkArrayList4() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		
		ArrayList<String> list2 = list;
		list.add("Ooops");
		for (String tempData : list2) {
			System.out.println("List2 " + tempData);
		}
	}

}
