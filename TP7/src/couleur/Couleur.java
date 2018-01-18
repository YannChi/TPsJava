package couleur;

import style.Style;

import java.util.ArrayList;
import java.util.Collections;

public enum Couleur
{
	BLANC(0, "#FFFFFF"), NOIR(1, "#191919"), ROUGE(2, "#FF0000"), JAUNE(3, "#FFD940"), BLEU(4, "#495CFF");

	private final int code;
	private final String codeHTML;

	private Couleur(int c1, String c2)
	{
		code = c1;
		codeHTML = c2;
	}

	public int getCode() { return code; }

	public String getCodeHTML() { return codeHTML; }

	@Override public String toString()
	{
		return super.toString().toLowerCase();
	}

	public String toString(Style ... styles)
	{
		String ret = "";
		ArrayList<Style> ts = new ArrayList<Style>();

		for(Style st : styles)
		{
			ret += String.format("<%s>", st);
			ts.add(st);
		}
		ret += this.toString();
		Collections.reverse(ts);
		for(Style st : ts)
		{
			ret += String.format("</%s>", st);
		}

		return ret;
	}

	public static void affiche()
	{
		for (Couleur c : Couleur.values()) {
			System.out.printf("%5s %d %s\n", c, c.code, c.codeHTML);
		}
	}

	public static String appliqueStyle(String s, Style style)
	{
		return "<" + style + ">" + s + "</" + style + ">";
	}

	public static void main(String [] args)
	{
		Couleur.affiche();
	}
}

