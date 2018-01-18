package main;

import couleur.Couleur;
import ex6.Bidule;
import ex6.Tri;
import ex6.TriFusion;
import personne.Genre;
import personne.Personne;
import style.Style;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programme
{
	public static void main(String[] args)
	{
		/*System.out.println(Couleur.BLANC.toString(Style.GRAS, Style.EXPOSANT, Style.ITALIQUE));
		Personne p = new Personne("DuComptel", "Pain au four", 128, Genre.HOMME);*/

		/*Tri<Integer> tr = new TriFusion(Arrays.asList(2, 8, 4, 9, 45, 12, 8, 78, 35, 44));

		tr.affiche();
		tr.trie();
		tr.affiche();*/

		List<Bidule> g = new ArrayList<Bidule>();
		g.add(new Bidule(2));
		g.add(new Bidule(6));
		g.add(new Bidule(5));
		g.add(new Bidule(3));

		Tri<Bidule> ttr = new TriFusion(g);

		ttr.affiche();
		ttr.trie();
		System.out.println();
		ttr.affiche();
	}
}
