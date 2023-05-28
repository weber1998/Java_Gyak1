
package modell;

import java.io.Serializable;

public class Növény implements Serializable{
    private String id;
    private final String név;
    private int ár;
    private int kor;

    public Növény(String id, String név, int ár, int kor) {
        this.id = id;
        this.név = név;
        this.ár = ár;
        this.kor = kor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNév() {
        return név;
    }

    public int getÁr() {
        return ár;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }
    
    
}
