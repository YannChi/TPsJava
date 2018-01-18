package personne;

import java.util.Calendar;
import java.util.Date;

class ExceptionPersonnedDejàMariee extends Exception
{
	public ExceptionPersonnedDejàMariee(String str)
	{
		super(str);
	}
}
class ExceptionPersonnesDeMêmeSexe extends Exception
{
	public ExceptionPersonnesDeMêmeSexe(String str)
	{
		super(str);
	}
}

public class Personne
{
	private static int compteur = 0;
	private String nom;
	private String prenom;
	private int age;
	private Genre g;
	private Personne conjoint;
	
	private String Numero(int compteur)
	{
		if(compteur == 1)
			return compteur+"ère";
		else
			return compteur+"ème";
	}
	
	private String Singuriel(int age)
	{
		return age + ((age > 1) ? " ans" : " an");
	}
	
	private int Annee()
	{
		return Calendar.getInstance().get(Calendar.YEAR) - this.age;
	}
	
	public Personne(String nom, String prenom, int age, Genre g)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.g = g;
		this.conjoint = null;
		compteur++;
		
		System.out.println("Naissance de la "+Numero(compteur)+" personne.");
	}
	
	public String afficheAge(int annee)
	{
		String ret = this.nom+" "+this.prenom+" ";
		int anneeActu = Calendar.getInstance().get(Calendar.YEAR);
		
		if(annee < anneeActu && annee > Annee())
		{
			ret += "avait "+ Singuriel(Math.abs(annee - Annee()));
		}
		else if(annee < anneeActu && annee < Annee())
		{
			ret += "panne";
		}
		else if(annee > anneeActu)
		{
			ret += "aura "+ (Math.abs(annee - Annee()));
		}
		else if (annee == anneeActu)
		{
			ret += "a "+ this.age;
		}
		else
		{
			ret += "est ne en " + annee;
		}
		
		return ret + ".";
	}
	
	public String afficheAge()
	{
		return this.g + " " + this.nom+" "+this.prenom+" a " + this.age + " ans en " + Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void marier(Personne p) throws ExceptionPersonnedDejàMariee
	{
		if(p != null)
		{
			if(this.conjoint != null)
			{
				throw new ExceptionPersonnedDejàMariee("Divorce !");
			}
			else
			{
				if(this.g == p.g)
				{
					throw new ExceptionPersonnedDejàMariee("Mariage pour personne !");
				}
				this.conjoint = p;
			}
		}
		else
			throw new NullPointerException(":( Le conjoint n'existe pas !");
	}
	
	@Override
	public String toString()
	{
		return this.g + " " + this.nom+" "+this.prenom+" ne en "+Annee();
	}

	public static int getNombreInstances()
	{
		return compteur;
	}

	public int compareTo(Personne personne)
	{
		if(this.age == personne.getAge())
			return 0;
		else if(this.age < personne.getAge())
			return -1;
		else
			return 1;
	}

	public static int compareTo(Personne personne, Personne personne2)
	{
		if(personne.getAge() == personne2.getAge())
			return 0;
		else if(personne.getAge() < personne2.getAge())
			return -1;
		else
			return 1;
	}

	public boolean estAncetre(Personne personne)
	{
		
		return false;
	}
}
