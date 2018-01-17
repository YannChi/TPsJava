package personne;

import java.util.Calendar;
import java.util.Date;

public class Personne
{
	private static int compteur = 0;
	private String nom;
	private String pr�nom;
	private int �ge;
	private char g;
	private Personne conjoint;
	
	private String Num�ro(int compteur)
	{
		if(compteur == 1)
			return compteur+"�re";
		else
			return compteur+"�me";
	}
	
	private String Singuriel(int �ge)
	{
		return �ge + ((�ge > 1) ? " ans" : " an");
	}
	
	private int Ann�e()
	{
		return Calendar.getInstance().get(Calendar.YEAR) - this.�ge;
	}
	
	public Personne(String nom, String pr�nom, int �ge, char g)
	{
		this.nom = nom;
		this.pr�nom = pr�nom;
		this.�ge = �ge;
		this.g = g;
		this.conjoint = null;
		compteur++;
		
		System.out.println("Naissance de la "+Num�ro(compteur)+" personne.");
	}
	
	public String affiche�ge(int ann�e)
	{
		String ret = this.nom+" "+this.pr�nom+" ";
		int ann�eActu = Calendar.getInstance().get(Calendar.YEAR);
		
		if(ann�e < ann�eActu && ann�e > Ann�e())
		{
			ret += "avait "+ Singuriel(Math.abs(ann�e - Ann�e()));
		}
		else if(ann�e < ann�eActu && ann�e < Ann�e())
		{
			ret += "pann�";
		}
		else if(ann�e > ann�eActu)
		{
			ret += "aura "+ (Math.abs(ann�e - Ann�e()));
		}
		else if (ann�e == ann�eActu)
		{
			ret += "a "+ this.�ge;
		}
		else
		{
			ret += "est n� en " + ann�e;
		}
		
		return ret + ".";
	}
	
	public String affiche�ge()
	{
		return this.g + " " + this.nom+" "+this.pr�nom+" a " + this.�ge + " ans en " + Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public int get�ge()
	{
		return this.�ge;
	}
	
	public void marier(Personne p)
	{
		if(p != null)
			this.conjoint = p;
		else
			throw new NullPointerException(":( Le conjoint n'existe pas !");
	}
	
	@Override
	public String toString()
	{
		return this.g + " " + this.nom+" "+this.pr�nom+" n� en "+Ann�e();
	}

	public static int getNombreInstances()
	{
		return compteur;
	}

	public int compareTo(Personne personne)
	{
		if(this.�ge == personne.get�ge())
			return 0;
		else if(this.�ge < personne.get�ge())
			return -1;
		else
			return 1;
	}

	public static int compareTo(Personne personne, Personne personne2)
	{
		if(personne.get�ge() == personne2.get�ge())
			return 0;
		else if(personne.get�ge() < personne2.get�ge())
			return -1;
		else
			return 1;
	}

	public boolean estAncetre(Personne personne)
	{
		
		return false;
	}
}
