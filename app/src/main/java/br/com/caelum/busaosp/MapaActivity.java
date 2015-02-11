package br.com.caelum.busaosp;

import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MapaActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        FragmentTransaction tx = getFragmentManager().beginTransaction();
        tx.replace(R.id.mapa, new MapaFragment());
        tx.commit();
    }
}
