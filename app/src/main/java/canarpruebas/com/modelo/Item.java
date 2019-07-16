package canarpruebas.com.modelo;

public class Item {
    private String ITEM_NOMBRE;
    private String ITEM_DESCRIPCION;
    private String ITEM_DIRECCION;
    private String ITEM_TELEFONO;
    private String ITEM_WEB;
    private String ITEM_EMAIL;

    public Item() {

    }

    public Item(String ITEM_NOMBRE, String ITEM_DESCRIPCION, String ITEM_DIRECCION, String ITEM_TELEFONO, String ITEM_WEB, String ITEM_EMAIL) {
        this.ITEM_NOMBRE = ITEM_NOMBRE;
        this.ITEM_DESCRIPCION = ITEM_DESCRIPCION;
        this.ITEM_DIRECCION = ITEM_DIRECCION;
        this.ITEM_TELEFONO = ITEM_TELEFONO;
        this.ITEM_WEB = ITEM_WEB;
        this.ITEM_EMAIL = ITEM_EMAIL;
    }

    public String getITEM_NOMBRE() {
        return ITEM_NOMBRE;
    }

    public void setITEM_NOMBRE(String ITEM_NOMBRE) {
        this.ITEM_NOMBRE = ITEM_NOMBRE;
    }

    public String getITEM_DESCRIPCION() {
        return ITEM_DESCRIPCION;
    }

    public void setITEM_DESCRIPCION(String ITEM_DESCRIPCION) {
        this.ITEM_DESCRIPCION = ITEM_DESCRIPCION;
    }

    public String getITEM_DIRECCION() {
        return ITEM_DIRECCION;
    }

    public void setITEM_DIRECCION(String ITEM_DIRECCION) {
        this.ITEM_DIRECCION = ITEM_DIRECCION;
    }

    public String getITEM_TELEFONO() {
        return ITEM_TELEFONO;
    }

    public void setITEM_TELEFONO(String ITEM_TELEFONO) {
        this.ITEM_TELEFONO = ITEM_TELEFONO;
    }

    public String getITEM_WEB() {
        return ITEM_WEB;
    }

    public void setITEM_WEB(String ITEM_WEB) {
        this.ITEM_WEB = ITEM_WEB;
    }

    public String getITEM_EMAIL() {
        return ITEM_EMAIL;
    }

    public void setITEM_EMAIL(String ITEM_EMAIL) {
        this.ITEM_EMAIL = ITEM_EMAIL;
    }
}
