package TP4;

public class ComptePlacement extends CompteBancaire
{
	public ComptePlacement()
	{
		super();
	}

	@Override
	public void dépot(float montant) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Opération impossible :(");
	}
}
