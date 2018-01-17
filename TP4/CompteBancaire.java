package TP4;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

import personne.Personne;


public abstract class CompteBancaire
{
	protected float solde;
	protected final String numéroCompte;
	
	CompteBancaire()
	{
		solde = 0;
		numéroCompte = UUID.randomUUID().toString();
	}
	
	@Override
	public String toString()
	{
		return new StringBuilder()
				.append(this.getClass().getSimpleName() + " ")
				.append("n° " + numéroCompte + ", ")
				.append("solde = " + Float.toString(this.solde))
				.append(" €")
				.toString();
	}
	
	public void dépot(float arg)
	{
		this.solde += arg;
	}
	
	public boolean retrait(float ret)
	{
		float tmp = this.solde - ret;
		if(tmp >= 0)
		{
			this.solde = tmp;
			return true;
		}
		else
		{
			return false;
		}
	}
}