
public class Ex03 {

	public static void main(String[] args) {
		int[] arr = {2, 5, -3, 10, 4, 6, 2, 9, 8};
		//int max = findMax(arr);
		//System.out.println("Maximum value = " + max);
		int[] ids = find(arr, 0, arr.length-1);
		System.out.println("Maximum value = " + arr[ids[0]] 
				+ ", at position " + ids[0]);
		System.out.println("Minimum value = " + arr[ids[1]] 
				+ ", at position " + ids[1]);
	}
	private static int[] find(int[] arr, int lo, int up) {
		if(lo==up)
			return new int[] {lo, lo};
		else {
			int[] x = find(arr,lo,up-1);
			int idMax = (arr[x[0]] > arr[up]) 
					? x[0] : up;
			int idMin = (arr[x[1]] < arr[up]) 
					? x[1] : up;
			return new int[] {idMax, idMin};
		}
	}
	private static int[] findMax(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		return new int[] {max, min};
	}

}
