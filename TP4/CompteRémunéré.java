package TP4;

import personne.Personne;

public class CompteR�mun�r� extends CompteClassique
{
	private float taux;
	
	CompteR�mun�r�(Personne titulaire, float taux)
	{
		super(titulaire);
		this.taux = taux;
	}
	
	public CompteR�mun�r�(Personne titulaire)
	{
		this(titulaire, 0.105f);
	}
	
	
	
	
}
