/*
 * Ques. Find the maximum and minimum element in an array
 */
package dsAlgo;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++) {
	arr[i]=sc.nextInt();
}
int min=100000;
int max=-100000;
for(int i=0;i<size;i++) {
	if(arr[i]<min)
		min=arr[i];
	if(arr[i]>max)
		max=arr[i];
}
System.out.println("Min:"+min+" Max:"+max);

sc.close();

	}

}
