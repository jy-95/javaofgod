package chapter5;

public class OperatorIncrement {

	public static void main(String[] args) {
		OperatorIncrement sample = new OperatorIncrement();
		//sample.increment();
		sample.comparison();
	}

	public void increment() {
		int intValue=1;
		System.out.println(intValue++);
		System.out.println(intValue);
		System.out.println(++intValue);
	}
	public void comparison() {
		boolean a = true;
		boolean b = false;
		System.out.println(a != b);
	}
}
