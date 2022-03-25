package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class Employee 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("vivekSingh");
		arrayList.add("naeemAhmed");
		arrayList.add("vibhhor");
		arrayList.add("sumit");
		arrayList.add("himansu");
		System.out.println("Before  using lambda Expression: "+arrayList);
		Collections.sort(arrayList);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("After sorting :"+arrayList);
		

	}

}
