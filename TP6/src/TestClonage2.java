
import java.util.ArrayList;

public class TestClonage2 {
	public static void main(String [] args) throws CloneNotSupportedException {
				
		Liste liste1 = new Liste();
		liste1.add( new StringBuilder("Bonjour"));
		Liste liste2 = liste1.clone();
		Liste liste3 = liste1;
		
		liste1.deleteFirstChartOf(0);
		liste1.add( new StringBuilder("Salut")); 
		System.out.println("liste1("+liste1.getReference()+")="+liste1.getReferenceDuContenu()+')'+liste1);
		System.out.println("liste2("+liste2.getReference()+")="+liste2.getReferenceDuContenu()+')'+liste2);
		System.out.println("liste3("+liste3.getReference()+")="+liste3.getReferenceDuContenu()+')'+liste3);
		System.out.println();
		
		ArrayList l = new ArrayList();
		l.add( new StringBuilder("Au revoir"));
		if ( liste2.setContenu(l) ) {
			System.out.println("liste1=("+liste1.getReferenceDuContenu()+')'+liste1);
			System.out.println("liste2=("+liste2.getReferenceDuContenu()+')'+liste2);
		}
		System.out.println();

		Object[] tableau = new Object[3];
		tableau[0] = liste1;
		tableau[1] = liste2;
		tableau[2] = liste3;

		for(Object o : tableau)
		{
			if(o instanceof Cloneable)
			{
				System.out.println(o);
			}
		}

		ListeNommee ln1 = new ListeNommee("Tarte au chocolat");
		ListeNommee ln2 = (ListeNommee)ln1.clone();

		System.out.println("ln1 "+ln1.getReference()+" = "+ln1.getReferenceDuContenu()+" "+ln1);
		System.out.println("ln2 "+ln2.getReference()+" = "+ln2.getReferenceDuContenu()+" "+ln2);


	}
}
