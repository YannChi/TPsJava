package ex6;

import java.util.Collections;
import java.util.List;

public class TriFusion extends Tri
{
	public TriFusion(List liste)
	{
		super(liste);
	}

	@Override
	public void trie()
	{
		Collections.sort(this.liste);
	}
}
