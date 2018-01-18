package ex6;

public class Bidule implements Comparable<Bidule>
{
	private int valeur;

	public Bidule(int valeur)
	{
		this.valeur = valeur;
	}

	private int getValeur()
	{
		return this.valeur;
	}

	@Override
	public int compareTo(Bidule b)
	{
			if(b.getValeur() == this.valeur)
				return 0;
			else if(b.getValeur() < this.valeur)
				return 1;
			else return -1;
	}

	@Override
	public String toString()
	{
		return Integer.toString(this.valeur);
	}
}
