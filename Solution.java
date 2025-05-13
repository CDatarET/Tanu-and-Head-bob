import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int c = 0; c < cases; c++){
		    int l = scan.nextInt();
		    String act = scan.next();
		    boolean broke = false;
		    
		    for(int i = 0; i < l; i++){
		        if(act.charAt(i) == 'Y'){
		            System.out.println("NOT INDIAN");
		            broke = true;
		            break;
		        }
		        if(act.charAt(i) == 'I'){
		            System.out.println("INDIAN");
		            broke = true;
		            break;
		        }
		    }
		    if(!broke){
		        System.out.println("NOT SURE");
		    }
		}

	}
}
