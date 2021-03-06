


class ExceptionNombreNegatif extends Exception {
   ExceptionNombreNegatif(String message) { super(message); }
}

class ExceptionTropGrand extends Exception {
   ExceptionTropGrand(String message) { super(message); }
}

class Factorielle {
  private static void erreur(int n) throws ExceptionTropGrand {
	  throw (new ExceptionTropGrand(n + " est trop grand pour ce programme"));
  }

  private static void tester(int resultat, int limite,  int n) throws ExceptionTropGrand {
	  if ( resultat > limite) erreur(n);
  }

  public static void main(String[] argv) {
    int i, n = 0,  factorielle = 1;

    try {
    	n = Integer.parseInt(argv[0]);
    	if (n < 0) throw (new ExceptionNombreNegatif("Le nombre "+ n + " est negatif"));
    	for (i = 2; i <= n; i++) {
    		tester( factorielle, Integer.MAX_VALUE / i, n);
    		factorielle *= i;
    	}
    	System.out.println(n + "! = " + factorielle);
    }
    catch (ArrayIndexOutOfBoundsException e) {
    	System.out.println("Erreur : l'entier dont on souhaite calculer la factorielle  "
			   + "doit etre donne en argument du programme");
    }
    catch(NumberFormatException e) {
    	System.out.println("Erreur : l'argument doit être entier");
    }
    catch(ExceptionNombreNegatif e) {
    	System.out.println(e + " : factorielle n'est pas définie pour un nombre negatif");
    }
    catch(ExceptionTropGrand e) { 
    	System.out.println( "*** getLocalizedMessage :\n" + e.getLocalizedMessage());
    	System.out.println( "*** getCause :\n" + e.getCause());
    	System.out.println( "*** getClass :\n" + e.getClass());
    	System.out.println( "*** printStackTrace :\n"); 
    	e.printStackTrace();
    }
  }
}