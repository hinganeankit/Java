package vector;

import java.util.Vector;

public class Basic {
   public static void main(String[] args) {
	   
   Vector list = new Vector();
	   list.add("Ankit");
	   list.add("Hingane");
	   list.add(25);
	   list.add(true);
	   list.add('M');
	   System.out.println(list);
	   
    Vector<String> list2 = new Vector<String>();
	   list.add("Pratik");
	   list.add("Hingane");
	   list.add(22);
	   list.add(true);
	   list.add('M');
	   list.add("Shegaon");
	  
	   System.out.println(list2);
	    list.addAll(list2);
	   System.out.println(list);
	   System.out.println("Is contains:"+list.contains("Shegaon"));
	   System.out.println(list);
	   System.out.println(list.remove("Shegaon"));
	   System.out.println(list);

	   
	   
	
}
}
