import java.util.ArrayList;

public class TestClonage1 {
	public static void main(String [] args) {
				
		//new Integer(0).clone();
		
		ListeNommee liste1 = new ListeNommee( "Premiere liste");
		liste1.add( new StringBuilder("Bonjour"));
		//Liste liste2 = (Liste) liste1.clone();
		System.out.println( liste1);
		//System.out.println( liste2);
	}
}
