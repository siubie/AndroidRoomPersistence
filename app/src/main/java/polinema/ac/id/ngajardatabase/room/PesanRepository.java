package polinema.ac.id.ngajardatabase.room;

import android.annotation.SuppressLint;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.AsyncTask;

public class PesanRepository {
    private String DB_NAME = "Pesan";

    private PesanDb pesandb;

    public PesanRepository(Context context) {
        pesandb = Room.databaseBuilder(context,PesanDb.class,DB_NAME).build();
    }

    @SuppressLint("StaticFieldLeak")
    public void insertPesan(final Pesan pesan){
        new AsyncTask<Void,Void,Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                pesandb.daoAccess().insertPesan(pesan);
                return null;
            }
        }.execute();
    }
}
