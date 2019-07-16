package canarpruebas.com.modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ManagerHelper {
    ControlHelper controlHelper;
    SQLiteDatabase db;

    public ManagerHelper(Context context){
        controlHelper = new ControlHelper(context);//Conexion a la base de datos
    }

    public void OpenBdWrite(){ //METODO PARA ABRIR LA BD MODO ESCRITURA
        db = controlHelper.getWritableDatabase();
    }

    public void  OpenBdRead(){ //METODO PARA ABRIR LA BD MODO ESCRITURA
        db = controlHelper.getWritableDatabase();
    }

}
