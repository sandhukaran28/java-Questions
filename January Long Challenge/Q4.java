package jan_long;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			long N=sc.nextInt();
			long K=sc.nextInt();
			long x=sc.nextInt();
			long y=sc.nextInt();
			if(x==y) {
				System.out.println(N+" "+N);
				continue;
			}
			long arr[][]=new long[4][2];
			if(x>y) {
				for(int i=0;i<4;i++) {
					switch(i) {
					case 0:{
						arr[0][0]=N;
						arr[0][1]=N-x+y;
						break;
					}
					case 1:{
						arr[1][0]=N+y-x;
						arr[1][1]=N;
						break;
					}
					case 2:{
						arr[2][0]=0;
						arr[2][1]=x-y;
						break;
					}
					case 3:{
						arr[3][0]=x-y;
						arr[3][1]=0;
						break;
					}
					}
				}
			}
			else if(x<y) {
				for(int i=0;i<4;i++) {
					switch(i) {
					case 0:{
						arr[0][0]=N-y+x;
						arr[0][1]=N;
						break;
					}
					case 1:{
						arr[1][0]=N;
						arr[1][1]=N+x-y;
						break;
					}
					case 2:{
						arr[2][0]=y-x;
						arr[2][1]=0;
						break;
					}
					case 3:{
						arr[3][0]=0;
						arr[3][1]=y-x;
						break;
					}
					}
				}
			}
			int res=(int) (K%4);
			if(res!=0)
			System.out.println(arr[res-1][0]+" "+arr[res-1][1]);
			else {
				System.out.println(arr[3][0]+" "+arr[3][1]);
			}
		}
		sc.close();

	}

}
