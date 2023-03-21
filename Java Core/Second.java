import java.util.*;

class Second{
public static void main(String[] args){
int a=5,b=a++;
int c=b++;
int a=5,b=++a;
int c=++b;
System.out.print(a+" "+b+" "+c);
}
}