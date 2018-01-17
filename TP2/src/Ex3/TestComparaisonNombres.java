package Ex3;

public class TestComparaisonNombres
{
	public TestComparaisonNombres()
	{
		Entier e = new Entier(8);
		Integer inombre1 = new Integer( 10);
		Float fnombre2 = new Float( 10.0);
		int nombre1 = 10, nombre3 = 15;
		float nombre2 = 10.0f;
		
		System.out.println(compare( nombre1, nombre2));
		//System.out.println(compare( inombre1, fnombre2));
		System.out.println();
		System.out.println( inombre1 + " " + nombre3);
		
		Modifie( inombre1, nombre3);
		
		System.out.println( inombre1 + " " + nombre3);
		System.out.println();
		System.out.println( e + " " + nombre3);
		
		Modifie( e, nombre3);
		
		System.out.println( e + " " + nombre3);
	}
	
	public static void Modifie(Entier i, int j)
	{
		i.SetValeur(j);
		j++;
		
		System.out.println(i + " : " + j);
	}
	
	public static void Modifie(Integer i, int j)
	{
		i = new Integer(j);
		j++;
		
		System.out.println(i + " : " + j);
	}
	
	public static boolean compare(int i, float j)
	{
		return i == j;
	}
	
	public static boolean compare(Integer i, float j)
	{
		return i.equals(j);
	}
}
