package polinema.ac.id.ngajardatabase.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Pesan {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "noTelp")
    private String noTelp;
    @ColumnInfo(name = "pesan")
    private String pesan;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
}
