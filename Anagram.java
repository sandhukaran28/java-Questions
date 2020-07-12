package first1;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
     String a=sc.nextLine();
     String b=sc.nextLine();
    
      if(a.length()!=b.length())
      {
    	  System.out.println("Not Anagram");
      }
      else
      {
    	 boolean flag=true;
    	  int arr[]=new int[256];
    	  for(char e: a.toCharArray())
    	  {
    		  arr[(int)e]++;
    	  }
    	  for(char e: b.toCharArray())
    	  {
    		  arr[(int)e]--;
    	  }
    	  for(int i=0;i<256;i++)
    	  {
    		  if(arr[i]!=0)
    		  {
    			  flag=false;
    		  }
    	  }
    	  if(!flag)
    	  {
    		  System.out.println("Not Anagram");
    	  }
    	  else
    		  System.out.println("Anagram");
      }
	}

}
