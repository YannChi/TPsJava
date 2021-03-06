
import java.util.ArrayList;

public class Liste implements Cloneable {
	ArrayList contenu;
	public Liste() { contenu = new ArrayList(); }

	public String getReferenceDuContenu(){

		return contenu.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(contenu));
	}

	public String getReference(){ 
		return getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(this));
	}

	public boolean setContenu( ArrayList l) { 
		for (Object o : l) if (!(o instanceof StringBuilder)) return false;
		contenu=l; 
		return true;
	}

	public void add( StringBuilder s) { contenu.add(s); }
	public void deleteFirstChartOf(int i) { 
		((StringBuilder) contenu.get(i) ).deleteCharAt(0);
	}
	@Override public String toString() { return contenu.toString(); }

	@Override public Liste clone() throws CloneNotSupportedException
	{
		Liste nouvelle = (Liste)super.clone();
		nouvelle.contenu = (ArrayList)contenu.clone();
		return nouvelle;
	}
}
