package TP5;

import TP5.MatriceAbstraite;
import java.util.ArrayList;

public class MatriceTableau extends MatriceAbstraite
{
	private ArrayList<ArrayList<Integer>> mat;

	public MatriceTableau()
	{
		this.mat = new ArrayList<ArrayList<Integer>>();
	}

	@Override
	public int nbrLignes()
	{
		return mat.size();
	}

	public int nbrColonnes()
	{
		return mat.size();
	}

	@Override
	public int valeur(int i, int j)
	{
		return mat.get(i).get(j);
	}

	public void valeur(int i, int j, int v)
	{
		mat.get(i).add(v);
	}

	@Override
	public void plus(Matrice m)
	{

	}

	@Override
	public String toString()
	{
		String ret = "";
		for(ArrayList<Integer> l : mat)
		{
			ret += "(";
			for(Integer c : l)
			{
				ret += c.toString();
				ret += ",";
			}
			ret += ")\n";
		}

		return ret;
	}
}
