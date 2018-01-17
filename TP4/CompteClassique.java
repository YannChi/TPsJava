package TP4;

import personne.Personne;

public class CompteClassique
	extends CompteBancaire
{
	
	protected final Personne titulaire;
	
	public CompteClassique(Personne titulaire)
	{
		super();
		this.titulaire = titulaire;
	}
	
	@Override
	public String toString()
	{
		return new StringBuilder()
				.append(this.getClass().getName() + " ")
				.append("n° " + super.numéroCompte + ", ")
				.append(this.titulaire.toString())
				.append("solde = " + super.solde.toString())
				.append(" €.")
				.toString();
	}
}