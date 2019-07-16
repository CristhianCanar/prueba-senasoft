package canarpruebas.com.modelo;

public class Usuario {

    private String USU_NOMBRE;
    private String USU_TELEFONO;
    private String USU_EMAIL;

    public Usuario() {

    }

    public Usuario(String USU_NOMBRE, String USU_TELEFONO, String USU_EMAIL) {
        this.USU_NOMBRE = USU_NOMBRE;
        this.USU_TELEFONO = USU_TELEFONO;
        this.USU_EMAIL = USU_EMAIL;
    }

    public String getUSU_NOMBRE() {
        return USU_NOMBRE;
    }

    public void setUSU_NOMBRE(String USU_NOMBRE) {
        this.USU_NOMBRE = USU_NOMBRE;
    }

    public String getUSU_TELEFONO() {
        return USU_TELEFONO;
    }

    public void setUSU_TELEFONO(String USU_TELEFONO) {
        this.USU_TELEFONO = USU_TELEFONO;
    }

    public String getUSU_EMAIL() {
        return USU_EMAIL;
    }

    public void setUSU_EMAIL(String USU_EMAIL) {
        this.USU_EMAIL = USU_EMAIL;
    }
}
