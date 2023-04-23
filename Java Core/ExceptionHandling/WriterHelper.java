import java.util.*;

class WriterHelper{
public void writeList(){
try{
List<Integer> list=new ArrayList<>();
list.add(10);
System.out.println("Entering to try statement");
Integer a=list.get(1);
System.out.println("Accessing the first element: "+a);
}catch(IndexOutOfBoundsException e){
System.err.println("Catch IndexOutOfBoundsException: "+e.getMessage());
}
finally{
System.out.println("this will always print");
}
}
}