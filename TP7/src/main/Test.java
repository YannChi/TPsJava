package main;

import java.util.ArrayList;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList t1 = new ArrayList();
		ArrayList<Number> t2 = new ArrayList<Number>() ;
		float somme = 0.0f;

		t1.add( new Integer(1));
		t1.add( new Float(2.5));
		t1.add( new String( "bonjour"));

		for ( int i = 0; i < t1.size(); i++ )
			System.out.print ( (t1.get(i)).toString() + " ");

		System.out.println();

		for ( int i = 0; i < t1.size(); i++ )
			if ( t1.get(i) instanceof Number )
				somme += ((Number)t1.get(i)).floatValue();

		System.out.println( somme);

		t2.add( new Integer(1));
		t2.add( new Float(2.5));
		//t2.add(new String("test"));
		somme = 0.0f;

		for ( int i = 0; i < t2.size(); i++ )
			somme += t2.get(i).floatValue();

		System.out.println( somme);
	}
}

/*
1.
Quel est le résultat de l'exécution de ce programme ?

1 2.5 bonjour
3.5
3.5


2.
Peut-on enlever le cast
(Number)
 en ligne 19 ?

Non, car floatValue est une méthode de Number

3.
Peut-on enlever le test
if ( t1.get(i) instanceof Number )
en ligne 18

Non car le tableau parcouru contient un String, qui est alors converti en Number, ce qui n'est pas possible.

?
4.
Peut-on ajouter un objet de type String à t2 ?

Non car t2 est un ArrayList de Number, String n'étant pas compatible avec ce type.


5.
Que signifie l'annotation
 @SuppressWarnings("unchecked")
ajoutée à la méthode main ?

L’annotation @SuppressWarnings permet de signaler au compilateur que l’on a conscience de réaliser une opération risquée, et qu’il peut donc arrêter de signaler un éventuel problème

 */