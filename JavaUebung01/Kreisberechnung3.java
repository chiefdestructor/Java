/* Kreisberechnung: F�r einen Kreis werden der Umfang und der
* Fl�cheninhalt berechnet
* Der Kreisradius wird beim Programmstart als Parameter und
* die Einheit als zweiter Parameter �bergeben
*/

public class Kreisberechnung3 {
    public static void main(String [] args){
	double radius, umfang, inhalt;
	String einheit;
	einheit = args[1];
	radius = Double.parseDouble(args[0]);
	umfang = 2.0 * 3.1415926 * radius;
	inhalt = 3.1415926 * radius * radius;
	System.out.print("Umfang: ");
	System.out.print(umfang);
	System.out.println(" " + einheit);
	System.out.print("Flaeche: ");
	System.out.print(inhalt);
	System.out.println(" " + einheit + '\u00fd');
    }
}