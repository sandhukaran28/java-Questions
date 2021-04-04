package april_long;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int test=sc.nextInt();
     while(test-->0) {
    	 double k1,k2,k3,v;
    	 k1=sc.nextDouble();
    	 k2=sc.nextDouble();
    	 k3=sc.nextDouble();
    	 v=sc.nextDouble();
    	 double speed=k1*k2*k3*v;
    	 double time=100/speed;
    	 time=Math.round(time*100.0)/100.0;
    	 if(time<9.58)
    		 System.out.println("yes");
    	 else
    		 System.out.println("no");
    	 
     }
     sc.close();
	}

}
