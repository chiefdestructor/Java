//Programm zum Testen der Verwendung von Variablen

public class Variablen1 {
    public static void main(String[] args){
	    
		//Variablendeklaration
		byte bZahl;
		short sZahl;
		int iZahl;
		long lZahl;
		float fZahl;
		double dZahl;
		boolean bestanden;
		char zeichen;
		
		//Wertzuweisungen
		bZahl = 28;
		sZahl = -18453;
		iZahl = 4356576;
		lZahl = 345236577970L;
		fZahl = 4.37456678F;
		dZahl = 3645.564782;
		bestanden = true;
		zeichen = '%';
		
		//Variablen- und Wertausgabe
		System.out.print("bZahl: ");
		System.out.println(bZahl);
		System.out.print("sZahl: ");
		System.out.println(sZahl);
		System.out.print("iZahl: ");
		System.out.println(iZahl);
		System.out.print("lZahl: ");
		System.out.println(lZahl);
		System.out.print("fZahl: ");
		System.out.println(fZahl);
		System.out.print("dZahl: ");
		System.out.println(dZahl);
		System.out.print("bestanden: ");
		System.out.println(bestanden);
		System.out.print("zeichen: ");
		System.out.println(zeichen);
	}
}