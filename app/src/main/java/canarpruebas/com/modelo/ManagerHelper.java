package canarpruebas.com.modelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class ManagerHelper {
    ControlHelper controlHelper;
    SQLiteDatabase db;

    //Conexion a la base de datos
    public ManagerHelper(Context context){
        controlHelper = new ControlHelper(context);
    }

    public void OpenBdWrite(){ //METODO PARA ABRIR LA BD MODO ESCRITURA
        db = controlHelper.getWritableDatabase();
    }

    public void  OpenBdRead(){ //METODO PARA ABRIR LA BD MODO LECTURA
        db = controlHelper.getReadableDatabase();
    }

    public void  CloseBd(){ //METODO PARA CERRAR LA BD
        if (db!= null){
            db.close();
        }
    }


    //METODO PARA LA INSERCION DE DATOS
    public  long insertarDatosCategoria(Categoria categoria){
        OpenBdWrite();
        ContentValues contentValues = new ContentValues();
        ContentValues values = new ContentValues();

        values.put(Constantes.CAT_NOMBRE, categoria.getCatNomre());

        long resul = db.insert(Constantes.NOM_TABLA_CATEGORIA, null, values);

        return resul;
    }

    public  long insertarDatosUsuario(Usuario usuario) {
        OpenBdWrite();
        ContentValues contentValues = new ContentValues();
        ContentValues values = new ContentValues();

        values.put(Constantes.USU_NOMBRE, usuario.getUSU_NOMBRE());
        values.put(Constantes.USU_EMAIL, usuario.getUSU_EMAIL());
        values.put(Constantes.USU_TELEFONO, usuario.getUSU_TELEFONO());

        long resul = db.insert(Constantes.NOM_TABLA_USUARIOS, null, values);
        return resul;
    }

    public  long insertarDatosItem(Item item) {
        OpenBdWrite();
        ContentValues contentValues = new ContentValues();
        ContentValues values = new ContentValues();

        values.put(Constantes.ITEM_NOMBRE, item.getITEM_NOMBRE());
        values.put(Constantes.ITEM_DESCRIPCION, item.getITEM_DESCRIPCION());
        values.put(Constantes.ITEM_DIRECCION, item.getITEM_DIRECCION());
        values.put(Constantes.ITEM_TELEFONO, item.getITEM_TELEFONO());
        values.put(Constantes.ITEM_EMAIL, item.getITEM_EMAIL());
        values.put(Constantes.ITEM_WEB, item.getITEM_WEB());


        long resul = db.insert(Constantes.NOM_TABLA_USUARIOS, null, values);
        return resul;
    }


    //LISTAR DATOS

    public ArrayList<Categoria> listarDatosCategoria(){
        OpenBdWrite();
        ArrayList arrayList = new ArrayList<Categoria>();

        Cursor cursor = db.rawQuery(Constantes.Consulta+Constantes.NOM_TABLA_CATEGORIA,null);

        if (cursor.moveToFirst()){
            do {
                Categoria cat = new Categoria();
                cat.setCatNomre(cursor.getString(1));//pasar datos
                arrayList.add(cat);
            }while (cursor.moveToNext());
        }
        return arrayList;
    }

    public ArrayList<Usuario> listarDatosUsuario(){
        OpenBdWrite();
        ArrayList arrayList = new ArrayList<Usuario>();

        Cursor cursor = db.rawQuery(Constantes.Consulta+Constantes.NOM_TABLA_USUARIOS,null);

        if (cursor.moveToFirst()){
            do {
                Usuario usu= new Usuario();
                usu.setUSU_NOMBRE(cursor.getString(1));//pasar datos
                usu.setUSU_EMAIL(cursor.getString(2));
                usu.setUSU_TELEFONO(cursor.getString(3));
                arrayList.add(usu);
            }while (cursor.moveToNext());
        }
        return arrayList;
    }

    public ArrayList<Item> listarDatosItem(){
        OpenBdWrite();
        ArrayList arrayList = new ArrayList<Item>();

        Cursor cursor = db.rawQuery(Constantes.Consulta+Constantes.NOM_TABLA_ITEM,null);

        if (cursor.moveToFirst()){
            do {
                Item item = new Item();
                item.setITEM_NOMBRE(cursor.getString(1));//pasar datos
                item.setITEM_DESCRIPCION(cursor.getString(2));
                item.setITEM_DIRECCION(cursor.getString(3));
                item.setITEM_TELEFONO(cursor.getString(4));
                item.setITEM_EMAIL(cursor.getString(5));
                item.setITEM_WEB(cursor.getString(6));

                arrayList.add(item);
            }while (cursor.moveToNext());
        }
        return arrayList;
    }


    //Actualizar datos




    //Eliminar datos


    }
