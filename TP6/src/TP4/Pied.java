package TP4;

class Pied
{
	public static void main(String[] args)
	{
		ComptePlacement c = new ComptePlacement();

		try
		{
			//c.dépot(145500);
			//c.retrait(888999);
			c.virement(8899, c);
		}
		catch (Exception e)
		{
			System.out.println(e.getClass().getSimpleName() + " => " + e.getMessage());
		}
	}
}

