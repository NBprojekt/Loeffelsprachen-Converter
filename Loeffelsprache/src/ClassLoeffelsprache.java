/*
 * Copyright (C) 2017  Norbert Bartko
 *
 * Dieses Programm ist Freie Software: Sie können es unter den Bedingungen
 * der GNU General Public License, wie von der Free Software Foundation,
 * Version 3 der Lizenz oder (nach Ihrer Wahl) jeder neueren
 * veröffentlichten Version, weiterverbreiten und/oder modifizieren.
 * 
 * Dieses Programm wird in der Hoffnung, dass es nützlich sein wird, aber
 * OHNE JEDE GEWÄHRLEISTUNG, bereitgestellt; sogar ohne die implizite
 * Gewährleistung der MARKTFÄHIGKEIT oder EIGNUNG FÜR EINEN BESTIMMTEN ZWECK.
 * Siehe die GNU General Public License für weitere Details.
 * 
 * Sie sollten eine Kopie der GNU General Public License zusammen mit diesem
 * Programm erhalten haben. Wenn nicht, siehe <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Norbert Bartko
 */

public class ClassLoeffelsprache {
    // Das Globale Char Array Deklarieren
    char[] CharArray;
    
    // Konstruktoren für ClassLoeffelsprache mit + 2 Überladungen
    public ClassLoeffelsprache(String tmp ){
        /** Wenn ein String übergeben wurde, diesen
          * in ein char Array überführen
          */
        
        // Beim eingegebenen String die Leerzeichen vorne und hinten löschen 
        String text = tmp.trim();
        // Die länge des textes
        int laenge = text.length();
        
        // Das Globale Char Array Deklarieren
        CharArray = new char[laenge];
        
        // Die Eingebe in ein Char Array überführen
        for (int i = 0 ; i < laenge ; i++){
            CharArray[i] = text.charAt(i);
        }
    }
    public ClassLoeffelsprache(String[] tmp){
        /** Wenn ein String Array übergeben wurde, 
          * diesen in ein char Array Kopieren
          */
        
        // Variablen Initialisierung 
        String text = "";
        // Die länge des Texte  
        int eingLaenge = tmp.length;
        
        for (int i = 0 ; i < eingLaenge ; i++){
            text += tmp[i];
        }
        
        // Beim eingegebenen String die Leerzeichen vorne und hinten löschen 
        text = text.trim();
        // Die länge des textes
        int laenge = text.length();
        
        // Das Globale Char Array Deklarieren
        CharArray = new char[laenge];
        
        // Die Eingebe in ein Char Array überführen
        for (int i = 0 ; i < laenge ; i++){
            CharArray[i] = text.charAt(i);
        }
    }
    public ClassLoeffelsprache(char[] tmp){
        /** Wenn ein Char Array übergeben wurde, 
          * sich bedanken und das Array kopieren
          */
        
        // das EingabeArray in das CharArray kopieren
        CharArray = tmp.clone();
    }
    
    public String convertToLoeffelsprache(){
        // Ausgabe variable
        String ausgabe = "";
        boolean aenderung = false;
        
        // Deklarieren eines Strings mit allen Buchstaben die zu löffeln sind
        String loeffelBuchstaben = "aeiouüöä";
        
            // Algorithmus zur umwandlung normaler Sprache in Löffelsprache
        // Alle buchstaben des Array durchgehen
        for (int i = 0 ; i < CharArray.length; i++){
            // Änderung auf falsch setzen
            aenderung = false;
            // Alle löffelungsbedürftigen Buchstaben durchgehen
            for (int j = 0 ; j < loeffelBuchstaben.length() ; j++ ){
                // Prüfen ob der Buchstabe ein zu löffelnder Buchstabe ist 
                if (CharArray[i] == loeffelBuchstaben.charAt(j) ){
                    ausgabe += CharArray[i] + "l" + CharArray[i] + "w" + CharArray[i];
                    aenderung = true;
                }
            }
            // Fallse der buchstabe nicht  gelöffelt wurde dann den buchstaben hinzufügen
            if (!aenderung)ausgabe += CharArray[i];
        }
        
        // Rückgabe der gelöffelten Sprache
        return ausgabe.trim();
    }
}
