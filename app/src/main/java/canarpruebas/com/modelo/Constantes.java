package canarpruebas.com.modelo;

public class Constantes {

    public static final String NOM_BD ="PruebaSiete";
    public static final int VERSION_BD = 1;


    public static final String NOM_TABLA_USUARIOS ="USUARIOS";
    public static final String USU_ID = "USU_ID";
    public static final String USU_NOMBRE = "USU_NOMBRE";
    public static final String USU_TELEFONO= "USU_TELEFONO";
    public static final String USU_EMAIL = "USU_EMAIL";

    public static final String CrearTablaUsuarios = "CREATE TABLE  " + NOM_TABLA_USUARIOS +
            " (" +USU_ID + "  INTEGER PRIMARY KEY AUTOINCREMENT," + USU_NOMBRE + "  TEXT NOT NULL," +
            USU_TELEFONO + "   TEXT NOT NULL," + USU_EMAIL + " TEXT NOT NULL)";


    public static final String NOM_TABLA_ITEM ="ITEM";
    public static final String ITEM_ID = "ITEM_ID";
    public static final String ITEM_NOMBRE = "ITEM_NOMBRE";
    public static final String ITEM_DESCRIPCION = "ITEM_DESCRIPCION";
    public static final String ITEM_DIRECCION = "ITEM_DIRECCION";
    public static final String ITEM_TELEFONO = "ITEM_TELEFONO";
    public static final String ITEM_WEB = "ITEM_WEB";
    public static final String ITEM_EMAIL = "ITEM_EMAIL";

    public static final String CrearTablaItem = "CREATE TABLE  " + NOM_TABLA_ITEM +
            " (" +ITEM_ID + "  INTEGER PRIMARY KEY AUTOINCREMENT," + ITEM_NOMBRE + "  TEXT NOT NULL," +
            ITEM_DESCRIPCION + "   TEXT NOT NULL," + ITEM_DIRECCION + " TEXT NOT NULL" + ITEM_TELEFONO +
            " TEXT NOT NULL" + ITEM_WEB + " TEXT NOT NULL"+ ITEM_EMAIL + " TEXT NOT NULL)";


    public static final String NOM_TABLA_CATEGORIA ="CATEGORIA";
    public static final String CAT_ID = "CAT_ID";
    public static final String CAT_NOMBRE = "CAT_NOMBRE";

    public static final String CrearTablaCategoria = "CREATE TABLE  " + NOM_TABLA_CATEGORIA +
            " (" +CAT_ID + "  INTEGER PRIMARY KEY AUTOINCREMENT," + CAT_NOMBRE + "  TEXT NOT NULL)";


}
