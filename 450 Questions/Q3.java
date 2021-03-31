/*
 * Ques. Find the "Kth" max and min element of an array 
 */
package dsAlgo;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println("Kth max:"+arr[size-k]+" Min:"+arr[0]);
	sc.close();
	}

}
