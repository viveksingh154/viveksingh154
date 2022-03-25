package LambdaExpressions;

interface Add
{
	public int  add(int a,int b);
}
class Functional1
{
public static void main(String[] args) 
	{
	Add add=(a,b)->(a+b);
	System.out.println(add.add(5,4));
		
	}

}
