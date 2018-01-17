package TP4;

import personne.Personne;

public class CompteRémunéré extends CompteClassique
{
	private float taux;
	
	CompteRémunéré(Personne titulaire, float taux)
	{
		super(titulaire);
		this.taux = taux;
	}
	
	public CompteRémunéré(Personne titulaire)
	{
		this(titulaire, 0.105f);
	}
	
	
	
	
}
