package personne;

import java.util.Calendar;
import java.util.Date;

public class Personne
{
	private static int compteur = 0;
	private String nom;
	private String prénom;
	private int âge;
	private char g;
	private Personne conjoint;
	
	private String Numéro(int compteur)
	{
		if(compteur == 1)
			return compteur+"ère";
		else
			return compteur+"ème";
	}
	
	private String Singuriel(int âge)
	{
		return âge + ((âge > 1) ? " ans" : " an");
	}
	
	private int Année()
	{
		return Calendar.getInstance().get(Calendar.YEAR) - this.âge;
	}
	
	public Personne(String nom, String prénom, int âge, char g)
	{
		this.nom = nom;
		this.prénom = prénom;
		this.âge = âge;
		this.g = g;
		this.conjoint = null;
		compteur++;
		
		System.out.println("Naissance de la "+Numéro(compteur)+" personne.");
	}
	
	public String afficheÂge(int année)
	{
		String ret = this.nom+" "+this.prénom+" ";
		int annéeActu = Calendar.getInstance().get(Calendar.YEAR);
		
		if(année < annéeActu && année > Année())
		{
			ret += "avait "+ Singuriel(Math.abs(année - Année()));
		}
		else if(année < annéeActu && année < Année())
		{
			ret += "panné";
		}
		else if(année > annéeActu)
		{
			ret += "aura "+ (Math.abs(année - Année()));
		}
		else if (année == annéeActu)
		{
			ret += "a "+ this.âge;
		}
		else
		{
			ret += "est né en " + année;
		}
		
		return ret + ".";
	}
	
	public String afficheÂge()
	{
		return this.g + " " + this.nom+" "+this.prénom+" a " + this.âge + " ans en " + Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public int getÂge()
	{
		return this.âge;
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
		return this.g + " " + this.nom+" "+this.prénom+" né en "+Année();
	}

	public static int getNombreInstances()
	{
		return compteur;
	}

	public int compareTo(Personne personne)
	{
		if(this.âge == personne.getÂge())
			return 0;
		else if(this.âge < personne.getÂge())
			return -1;
		else
			return 1;
	}

	public static int compareTo(Personne personne, Personne personne2)
	{
		if(personne.getÂge() == personne2.getÂge())
			return 0;
		else if(personne.getÂge() < personne2.getÂge())
			return -1;
		else
			return 1;
	}

	public boolean estAncetre(Personne personne)
	{
		
		return false;
	}
}
