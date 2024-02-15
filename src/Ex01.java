
public class Ex01 {

	public static void main(String[] args) {
		// sum = 1 + 2 + 3 + ... + n
		int n = 100;
		//C1: Apply Gauss's summation
		int sum = n * (n+1)/2;
		System.out.println("Sum 01 = " + sum);
		
		//C2: Iteration
		sum = tinh(n);
		System.out.println("Sum 02 = " + sum);
		
		//C3: Recursion
		sum = tinhRec(n);
		System.out.println("Sum 03 = " + sum);
		/*
		  tinh(6) = tinh(5) 				+ 6 
		  		  = tinh(4) 			+ 5
		  		  = tinh(3) 		+ 4 
		  		  = tinh(2) 	+ 3 
		  		  = tinh(1) + 2
		  tinh(1) = 1
		  
		 */
	}

	private static int tinh(int n) { //Iterative function
		int sum = 0;
		for(int i=1; i<=n; i++)
			sum += i;
		return sum;
	}
	private static int tinhRec(int n) { //Recursive function
		if(n==1)
			return 1;
		else
			return tinhRec(n-1) + n;
	}

}
