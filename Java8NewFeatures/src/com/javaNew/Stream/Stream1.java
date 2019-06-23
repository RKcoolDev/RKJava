package com.javaNew.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(5);
	list.add(15);
	list.add(30);
	list.add(0);
	System.out.println(list);
	List<Integer> list2=list.stream().filter(value->value%2==0).collect(Collectors.toList());
	System.out.println(list.stream().mapToInt(Integer::intValue).sorted().toString());
	System.out.println(list2);
}
}
