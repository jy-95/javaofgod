package chapter7;

public class ManageHeight {
	int[][] gradeHeight;
	
	public static void main(String[] args) {
		ManageHeight height = new ManageHeight();
		height.setData();			//데이터 지정
		for(int i = 1; i<=5; i++) {	//classNo-1이 있으므로 i는 1부터
//			height.printHeight(i);
			height.printAverage(i);
		}	
	}
	
	public void setData() {
		gradeHeight = new int[5][];
		gradeHeight[0] = new int[]{170,180,173,175,177};
		gradeHeight[1] = new int[]{160,165,167,186};
		gradeHeight[2] = new int[]{158,177,187,176};
		gradeHeight[3] = new int[]{173,182,181};
		gradeHeight[4] = new int[]{170,180,165,177,172};
	}
	
//	public void printHeight(int classNo) {
//		System.out.println("ClassNo. " + classNo);
//		for(int data:gradeHeight[classNo-1]) {
//		System.out.println(data);
//		}
//	}
	
	public void printAverage(int classNo) {
		double sum = 0;
		int studentCount = gradeHeight[classNo-1].length;
		for(int data:gradeHeight[classNo-1]) {
			sum += data;
		}
		System.out.println(sum / studentCount);
	}

}
