import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SumPairFind {
	public static void main(String[] args) {
	List<Integer> list=new ArrayList<>(Arrays.asList(2,4,6,7,3,8,3,9));
	HashMap<Integer, Integer> map=new HashMap<>();
	int sum =11;
	for(int i=0;i<list.size();i++) {
		for(int j=1+1;j<list.size();j++) {
			if((list.get(i)+list.get(j))==sum) {
				System.out.println("Pair Found-->"+list.get(i)+"---->"+list.get(j));
				map.put(list.get(i), list.get(j));
			}
		}
	}
	System.out.println("Distinct Entry ...................>");
	for(Entry<Integer, Integer>entry:map.entrySet()) {
		System.out.println(entry.getKey()+"----->"+entry.getValue());
	}
	
	System.out.println("First Syso in Sum and Pair");
	
}
}
