package chapter7;

public class ArrayLength {

	public static void main(String[] args) {
		ArrayLength array = new ArrayLength();
		array.printArray();
		array.twoDimFor();
		array.twoDimForWithCounter();
	}
	public void printArray() {
		int [][]twoDim = {{1,2,3},{4,5,6}};
		System.out.println("twoDim.length= " + twoDim.length);
		System.out.println("twoDim[0].length= " + twoDim[0].length);
		
//		for(int oneLoop=0; oneLoop<2; oneLoop++) {
//			for(int twoLoop=0; twoLoop<3; twoLoop++) {
//				System.out.println("twoDim[" + oneLoop + "] [" 
//						+ twoLoop + "] =" + twoDim[oneLoop][twoLoop] );
//			}
//		}
		
//		for(int oneLoop=0; oneLoop<twoDim.length; oneLoop++) {
//			for(int twoLoop=0; twoLoop<twoDim[oneLoop].length; twoLoop++) {
//				System.out.println("twoDim[" + oneLoop + "] [" 
//						+ twoLoop + "] =" + twoDim[oneLoop][twoLoop] );			
//				}
//		}
		int twoDimLength=twoDim.length;
		for(int oneLoop=0; oneLoop<twoDimLength; oneLoop++) {
			int twoDimOneLength=twoDim[oneLoop].length;
			for(int twoLoop=0; twoLoop<twoDimOneLength; twoLoop++) {
				System.out.println("twoDim[" + oneLoop + "] [" 
						+ twoLoop + "] =" + twoDim[oneLoop][twoLoop] );			
				}
		}
		
	}
	
	public void twoDimFor() {
		int[][]twoDim= {{1,2,3},{4,5,6}};
		for(int[] dimArray:twoDim) {
			for(int data:dimArray) {
				System.out.println(data);
			}
		}
	}
	
	public void twoDimForWithCounter() {
		int[][]twoDim= {{1,2,3},{4,5,6}};
		int oneCounter=0;
		for(int[] dimArray:twoDim) {
			int twoCounter=0;
			for(int data:dimArray) {
				System.out.println(data);
				twoCounter++;
			}
			oneCounter++;
		}
		
	}

}
