
package nezet;

import modell.Kert;
import modell.Növény;

public class KertMain {
    public static void main(String[] args) {
        Kert kert = new Kert();
    
        Növény noveny1 = new Növény("ab01", "Rózsa", 10, 2);
        Növény noveny2 = new Növény("cd02", "Fenyőfa", 50, 5);
        Növény noveny3 = new Növény("ef03", "Nárcisz", 8, 1);

        kert.NövényHozzáadása(noveny1);
        kert.NövényHozzáadása(noveny2);
        kert.NövényHozzáadása(noveny3);
        
        kert.Mentés();
        
        kert.NövényEladása(noveny2);
        
        int összesNövény = kert.ÖsszesNövényDB();
        
        System.out.println("A kertben összesen " + összesNövény + " növény van.");
        
        kert = null;
        
        Kert betöltöttKert = new Kert();
        betöltöttKert.Betöltés();
        
        int betöltöttKertDb = betöltöttKert.ÖsszesNövényDB();
        System.out.println("Betöltött állapot: A kertben összesen " + betöltöttKertDb + " növény van.");

    }
}
