
public class ListeNommee extends Liste {
	String nom;
	public ListeNommee(String n) { super(); nom = new String(n); }
	@Override public String toString() { return nom + " " + super.toString(); }
}
