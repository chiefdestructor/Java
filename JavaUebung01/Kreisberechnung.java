/* Kreisberechnung: F�r einen Kreis mit dem Radius 5 cm
wird der Umfang und die Fl�che berechnet*/

public class Kreisberechnung {
    public static void main(String[] args ) {
	double radius, umfang, inhalt,flaeche;
	radius = 5.0;
	umfang = 2.0 * 3.1415926 * radius;
	flaeche = 3.1415926 * radius * radius;
	System.out.print("Umfang: ");
	System.out.println (umfang);
	System.out.print("Flaeche: ");
	System.out.println(flaeche);
    }
}