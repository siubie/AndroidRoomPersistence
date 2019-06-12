package polinema.ac.id.ngajardatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import polinema.ac.id.ngajardatabase.room.Pesan;
import polinema.ac.id.ngajardatabase.room.PesanRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PesanRepository pesanRepository = new PesanRepository(getApplicationContext());
        Pesan pesan = new Pesan();
        pesan.setNoTelp("009091023");
        pesan.setPesan("asdhakshdajhsdk");
        pesanRepository.insertPesan(pesan);
    }
}
