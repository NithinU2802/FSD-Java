/******************************************************************************

Method overloading implementation...

Input:
1. Two Integer
2. Three Integer

1
1 3
Output: 4

Input:
1. Two Integer
2. Three Integer

2
4 1 8
Output: 13

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static int add(int a,int b){
        return a+b;
    }
    
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("1. Two Integer\n2. Three Integer\n");
	int n=x.nextInt();
	Main m=new Main();
	int s=0;
	switch(n){
	    case 1:
	        int a=x.nextInt(),b=x.nextInt();
	        s=m.add(a,b);
	        break;
	    case 2:
	        int r=x.nextInt(),g=x.nextInt(),k=x.nextInt();
	        s=m.add(r,g,k);
	        break;
	    default: 
	    System.out.println("Invalid Option")
	     return;
	}
	System.out.println(s);
	}
}
