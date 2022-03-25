package LambdaExpressions;

interface Min
{
public int sub(int a,int b);
}
class Sub
{
	public static void main(String[] args) {
		Min sub=(a,b)->(a-b);
		System.out.println(sub.sub(5, 2));
	}
}
