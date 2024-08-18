import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<>();
		arr.add(23);
		arr.add(56);
		arr.add(44);
		arr.add(90);
		reverseElements(arr,0,arr.size()-1);
		System.out.println(arr);
	}
	
	public static void reverseElements(List<Integer> arr,int start,int end){
	    while(start<end){
	        Integer temp=arr.get(start);
	        arr.set(start,arr.get(end));
	        arr.set(end,temp);
	        start++;
	        end--;
	    }
	    
	}
}

//Using Colections

import java.util.*;
  public class Exercise11 {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  System.out.println("List before reversing :\n" + list_Strings);  
  Collections.reverse(list_Strings);
  System.out.println("List after reversing :\n" + list_Strings); 
 }
}
//Sample Output:

List before reversing :                                                
[Red, Green, Orange, White, Black]                                     
List after reversing :                                                 
[Black, White, Orange, Green, Red]  
