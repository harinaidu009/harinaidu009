import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1, "taruni");
		hm.put(2, "harshini");
		hm.put(3, "mouni");
		hm.put(4, "indira");
		hm.put(5, "bhuvi");
		hm.put(6,"pragu");
		hm.put(7, "usha");
		hm.put(8, "abhi");
		System.out.println(hm);
		System.out.println(hm.get(3));
	}

}