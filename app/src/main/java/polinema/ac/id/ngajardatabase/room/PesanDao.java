package polinema.ac.id.ngajardatabase.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

@Dao()
public interface PesanDao {

    @Insert
    Long insertPesan(Pesan pesan);

    @Update
    void updatePesan(Pesan pesan);

    @Delete
    void deletePesan(Pesan pesan);

}
