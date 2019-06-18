package code.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hms {
	public static void main(String[] args) {
		
	
	Map<String, List<String>> hm = new HashMap<String, List<String>>();
	
	List<String> valu = new ArrayList<String>();
	valu.add("hello");
	valu.add("Value2");
	hm.put("Key1", valu);
	System.out.println(hm);
}
}