package streamJ8;

import java.util.List;
import java.util.stream.*;

public class StreamMain {
	public static void main(String[] args) {
		//filter and map
		
		List<String> list1 = List.of("sdjyg","csac","sycf","sacyg");

		List<String> a = list1.stream().filter(e->e.endsWith("f")).collect(Collectors.toList());
		
		a.forEach(i->{
			System.out.println(i);
		});
		
		System.out.println("----------------------------");
		
		List<Integer> list2 = List.of(2,43,9,6,8,7,2,1,9); 
		List<Integer> a1 = list2.stream().map(i->i*i).collect(Collectors.toList());
		
		a1.forEach(e->{
			System.out.println(e);
		});
		
		//just by using system class
		list2.stream().forEach(System.out::println);
		
		//sorted
		System.out.println("-----------------------");
		list2.stream().sorted().forEach(System.out::println);
		
		System.out.println("---------------------------");
		
		//comparing methods in j 8
		
		
		Integer integer=  list2.stream().min((x,y)->x.compareTo(y)).get();
		
		System.out.println(integer);
		
		System.out.println("--");
		
		Integer integer1 = list2.stream().max((x,y)->x.compareTo(y)).get();
		
		System.out.println(integer1);


	}
}
