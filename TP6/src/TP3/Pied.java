package TP3;

import personne.*;

class Pied
{
	public static void main(String[] args)
	{
		Personne patinRoulette = new Personne("Jusdebert", "Marie-Aude", 42, 'F');
		Personne edriseur = new Personne("Maquiscompte", "Halconce", 15, 'F');

		try
		{
			patinRoulette.marier(edriseur);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
