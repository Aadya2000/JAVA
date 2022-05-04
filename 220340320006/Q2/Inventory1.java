import java.util.*;
public class Inventory1
{
public static void main(String args[])
{
HashMap<Integer,String>list=new HashMap<Integer,String>();
list.put(1,"nirama");
list.put(2,"Soap");
list.put(3,"Suger");
list.put(4,"brush");
list.remove(4,"brush");

System.out.println(list);



}
}