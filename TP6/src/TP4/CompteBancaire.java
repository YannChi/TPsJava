package TP4;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

import personne.Personne;

class ExceptionSoldeInsuffisant extends Exception
{
	public ExceptionSoldeInsuffisant(String msg)
	{
		super(msg);
	}
}

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
	
	public void dépot(float arg) throws IllegalArgumentException
	{
		if(arg <= 0)
		{
			throw new IllegalArgumentException("arg <= 0 :(");
		}

		this.solde += arg;
	}
	
	public boolean retrait(float ret) throws IllegalArgumentException
	{
		if(ret <= 0)
		{
			throw new IllegalArgumentException("ret <= 0 :(");
		}

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

	public void virement(float montant, CompteBancaire destination) throws IllegalArgumentException, ExceptionSoldeInsuffisant
	{
		if(montant <= 0) throw new IllegalArgumentException("montant <= 0 :(");
		if(montant > this.solde) throw new ExceptionSoldeInsuffisant("montant > solde :(");

	}
}