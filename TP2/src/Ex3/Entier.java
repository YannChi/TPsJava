package Ex3;

public class Entier
{
	private int valeur;
	
	public Entier(int i)
	{
		this.valeur = 1;
	}
	
	public void SetValeur(int i)
	{
		this.valeur = i;
	}
	
	public int GetValeur()
	{
		return this.valeur;
	}
	
	@Override
	public String toString()
	{
		return Integer.toString(this.valeur);
	}
}
