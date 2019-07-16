package canarpruebas.com.controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import canarpruebas.com.R;
import canarpruebas.com.modelo.AdaptadorCategoria;
import canarpruebas.com.modelo.Categoria;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referenciar();

        llenarLista();

    }

    private void referenciar() {

        listView = findViewById(R.id.lvListaCategoria);

    }

    private void llenarLista() {

        AdaptadorCategoria adaptadorCategoria = new AdaptadorCategoria(MainActivity.this);
        listView.setAdapter(adaptadorCategoria);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_item, menu);

        return true;

    }
}
