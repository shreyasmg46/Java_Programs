package BasicProgramsofJava;

public class LargestofNumbers {
	public static int getLargest(int[] a, int size){
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
		return a[size - 1];
	}

	public static void main(String[] args) {
		int a[]={1,2,3,5,7,9};
		int b[]={88,66,22,33,56,77};
		System.out.println("largest is " + getLargest(a, 6));
		System.out.println("Largest is " + getLargest(b, 6));
	}
}
