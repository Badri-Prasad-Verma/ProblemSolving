package app_java_code;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,2,3,4,4,5,6,6,7,8,8,9};
		int[] arr2=new int[arr1.length];
		int y=0;
		for (int i = 0; i < arr1.length-1; i++) {
			if(arr1[i]!=arr1[i+1]) {
				arr2[y]=arr1[i]; 
				y++;
			}
			arr2[y]=arr1[arr1.length-1];
		}
		for (int unique : arr2) {
			System.out.println(unique);
		}
	}
}
