package BasicProgramsofJava;

public class SecondLargestNumber {

	public static int getSecondLargest(int[] a, int size){
		int temp;
		for(int i=0; i<size; i++){
			for(int j=i+1; j<size; j++){
				if(a[i]>a[j]){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		return a[size - 2];
	}
	public static void main(String[] args) {
		int[] a ={22,55,89,98,100,66,74};
		int[] b ={6,8,7,3,2,4,9};
		System.out.println("Second Largest is " + getSecondLargest(a, 7));
		System.out.println("Second Largest is " + getSecondLargest(b, 7));
	}
}
