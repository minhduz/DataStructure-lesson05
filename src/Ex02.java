
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        /*
        Given two numbers A and B, write a program to find sum of all even numbers between A to B, both included. 
        Also, count how many even numbers in this range.
         */
       
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b: ");
        a = sc.nextInt();
        b = sc.nextInt();
       
        long sum = 0;
        int count = 0;
        //C1: Iteration : Phương pháp lặp
        int start = (a%2==0) ? a : (a+1);
        int end = (b%2==0) ? b : (b-1);
        for(int i=start; i<=b; i+=2) {
            sum = sum + i;
            count++;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
       // C2: Gauss's sum equation
        count = (end-start)/2 + 1;
        //sum = count * (end+start)/2 ;
        sum = count * ( ((long)end+start) / 2);
       
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
        
        /////////////
        // C3: Recursion
        sum = tinh(start, end);
        System.out.println("Sum = " + sum);
    }

	private static long tinh(int start, int end) {
		if(start == end)
			return start;
		else
			return tinh(start, end-2) + end;
		/*
		 if(start == end)
			return end;
		 else
			return tinh(start + 2, end) + start;
		 */
	}

}
