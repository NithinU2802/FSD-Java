class NestedTryCatch{
public static void main(String[] arg){
try{
try{
try{
int arr[]={1,2,3,4};
System.out.println(arr[10]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBound Exception Block 3");
throw e; // rethrowing the Exception
}
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBound Exception Block 2");
throw e; // rethrowing the Exception
}
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBound Exception Block 1");
}
catch(Exception e){
System.out.println("General Exception");
}



}
}