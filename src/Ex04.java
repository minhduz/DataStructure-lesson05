
public class Ex04 {

	public static void main(String[] args) {
		int[] arr = {2, 5, -3, 10, 4, 6, 2, 9, 8};
		int key = 6;
		
		//int flag = search(arr, key);
		int flag = searchRec(arr, key, 0, arr.length-1);
		if(flag != -1) 
			System.out.println("Found, at position " + flag);
		else
			System.out.println("NOT Found");
	}

//	private static boolean searchRec(int[] arr, int key, int lo, int up) {
//		if(up==lo)
//			return (arr[lo] == key);
//		else
//			return  (arr[up]==key) || searchRec(arr,key, lo, up-1);
//	}
	private static int searchRec(int[] arr, int key, int lo, int up) {
		if(up==lo)
			return (arr[lo] == key) ? lo : -1;
		else
			return (arr[up]==key) ? up: searchRec(arr,key, lo, up-1);
	}
	private static int search(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}

}
