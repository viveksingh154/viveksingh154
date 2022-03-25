package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class PrintAllDetails {

	public static void main(String[] args) 
	{
		ArrayList<EmployeeAllDetails> arrayList=new ArrayList<EmployeeAllDetails>();
		arrayList.add(new EmployeeAllDetails(1,"viveksingh",500));
		arrayList.add(new EmployeeAllDetails(5, "vibhor",700));
		arrayList.add(new EmployeeAllDetails(6,"naeem",900));
		arrayList.add(new EmployeeAllDetails(4, "sumitsingh",1100));
		System.out.println("beforre using java8 in our code");
		/*
		 * for(EmployeeAllDetails ss:arrayList) { System.out.println(ss); }
		 */
		for(int j=0;j<arrayList.size();j++)
		{
		System.out.println( arrayList.get(j));	
		}
	    System.out.println("After using java8");
	    //sorting the code on the name of Ascending order by using Comparators....
	    Collections.sort(arrayList, (o1,o2)->o1.getName().compareTo(o2.getName()));
	    System.out.println(arrayList);
	    //Sorting the code on the behave of salary in Ascending manner..
	   Collections.sort(arrayList,(o1,o2)->o1.getSalary()-o2.getSalary());
	   System.out.println(arrayList);
	   //Another ways of sorting in core java........
	   List<EmployeeAllDetails> collect = arrayList.stream().sorted(Comparator.comparingInt(EmployeeAllDetails::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
