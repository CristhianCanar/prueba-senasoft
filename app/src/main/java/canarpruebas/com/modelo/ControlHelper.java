package canarpruebas.com.modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class ControlHelper extends SQLiteOpenHelper {

    public ControlHelper(Context context) {
        super(context, Constantes.NOM_BD, null, Constantes.VERSION_BD);



    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(Constantes.CrearTablaCategoria);
        sqLiteDatabase.execSQL(Constantes.CrearTablaItem);
        sqLiteDatabase.execSQL(Constantes.CrearTablaUsuarios);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
