import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaExcercise {
	public static void main(String[] args) {
		List<Person> pepole=new ArrayList<>(Arrays.asList(new Person("RK","Dixit",27),
				new Person("UK","Pandey",28),
				new Person("SK","Sharma",37),
				new Person("RS","Patel",47),
				new Person("GK","Chaubey",57)));
		
		/*Collections.sort(pepole,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});*/
		
		Collections.sort(pepole,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//pepole.forEach(obj->System.out.println(obj));
		printList(pepole,new MyListPrintInterface() {
			
			@Override
			public void print() {
				
			}
		});
		
		
		pepole.forEach(obj->obj.getLastName().startsWith("C"));
		//List<Person> psortList=pepole.stream().filter(obj->obj.getLastName().startsWith("C")).collect(Collectors.toList());
		
	}

	private static void printList(List<Person> pepole, MyListPrintInterface myListPrintInterface) {
		
	}
}
