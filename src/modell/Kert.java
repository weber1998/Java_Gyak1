
package modell;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Kert implements Serializable{
    private List<Növény> növények;
    
    public Kert() {
        növények = new ArrayList<>();
    }
    
    public void NövényHozzáadása(Növény növény) {
        növények.add(növény);
    }
    
    public void NövényEladása(Növény növény) {
        növények.remove(növény);
    }
    
    public int ÖsszesNövényDB() {
        return növények.size();
    }
    
    public List<Növény> összesNövény() {
        return növények;
    }
    
    public void Mentés() {
        try {
            FileOutputStream fileOut = new FileOutputStream("kert.bin");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(this);
            objOut.close();
            fileOut.close();
            System.out.println("Az állapot sikeresen elmentve a kert.bin fájlba.");
        } catch (IOException e) {
            System.out.println("Hiba történt az állapot mentésekor: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void Betöltés() {
        try {
            FileInputStream fileIn = new FileInputStream("kert.bin");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            Kert loadedKert = (Kert) objIn.readObject();
            this.növények = loadedKert.növények; // A növények másolása
            objIn.close();
            fileIn.close();
            System.out.println("Az állapot sikeresen betöltve.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hiba történt az állapot betöltésekor: " + e.getMessage());
            Kert kert = new Kert();
        }
    }
}
