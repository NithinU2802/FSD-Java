import java.util.*;

public class TreeBasic{
    public static void main(String[] arg){
        TreeSet<String> tree=new TreeSet<>();
        tree.add("B");
        tree.add("A");
        tree.add("C");
        tree.add("C");
        System.out.println(tree);
    }
}