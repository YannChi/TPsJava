package Ex4;


import java.lang.reflect.Array;
import java.util.Arrays;
import ExceptionsPersos.*;


public class Test
{
	public static final int taille_b = 5;
	private Exception fin;
	
	public Test()
	{
		Integer[] a = {100, 101, 102, 103, 104}, b, c;
		
		b = new Integer[this.taille_b];
		
		for(int i = 0 ; i < this.taille_b ; i++)
		{
			b[i] = 100 + 1;
		}
		
		c = new Integer[] {100, 101, 102, 103, 104};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println("---");
		System.out.println(Arrays.equals(b, a));
		System.out.println(Arrays.equals(b, c));
		System.out.println("---");
		System.out.println(Arrays.equals(c, a));
		System.out.println(Arrays.equals(c, b));
		
		try // hard
		{
			System.out.println(this.ToString2(a));
		}
		catch(ExceptionFinToString e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	private <T> String ToString2(T[] a) throws ExceptionFinToString
	{
		String ret = "{ ";
		int j = 0;
		int tailleNbr = 0;
		
		for(T i : a)
		{
			ret += i;
			j++;
			Double dbl = new Double((int) i);
			if(j == 2)
			{
				tailleNbr = (int)Math.floor((Math.log10(dbl + 1))-2);
				
				throw new ExceptionFinToString(
						ret.substring(tailleNbr, tailleNbr+5)
				+ " }");
			}
			ret += ", ";
			
		}

		return ret + "}";
	}
	
	private <T> String ToString(T[] a)
	{
		String ret = "{ ";
		
		for(T i : a)
		{
			ret += i + ", ";
		}
		
		return ret + "}";
	}
}
