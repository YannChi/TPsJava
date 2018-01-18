package ex6;

import java.util.List;

public abstract class Tri<T extends Comparable<? super T>>
{
	protected List<T> liste;

	public Tri(List<T> liste)
	{
		this.liste = liste;
	}

	public void affiche()
	{
		for(T t : this.liste)
		{
			System.out.println(t.toString());
		}
	}

	public abstract void trie();
}
