package polinema.ac.id.ngajardatabase.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Pesan.class}, version = 1, exportSchema = false)
public abstract class PesanDb extends RoomDatabase {
    public abstract PesanDao daoAccess();
}
