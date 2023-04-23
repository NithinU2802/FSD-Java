import java.util.*;

class HashSet1{
public static void main(String[] arg){
Set<String> h=new HashSet<>();
h.add("A");
h.add("B");
boolean r1=h.add("C");
System.out.println("First adding: "+r1);
boolean r2=h.add("C");
System.out.println("Second adding: "+r2);
System.out.println(h);
System.out.println("List Contains c or not?.. "+h.contains("C"));
h.remove("A");
System.out.println("List after removing A is "+h);
for(String i:h)
System.out.println(i);
}
}