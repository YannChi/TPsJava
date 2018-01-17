package TP5;

import java.util.ArrayList;

public abstract class MatriceAbstraite implements Matrice
{
	private int nbLignes;
	private int nbColonnes;


	abstract public void plus(Matrice m);
	abstract public String toString();
}
