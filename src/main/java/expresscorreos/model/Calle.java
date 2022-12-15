package expresscorreos.model;

public class Calle {
    private int id_calle;
    private String nombre_c;
    private String nombre_m;
    private int longitud;

    public Calle(int id_calle, String nombre_c, String nombre_m, int longitud) {
        this.id_calle = id_calle;
        this.nombre_c = nombre_c;
        this.nombre_m = nombre_m;
        this.longitud = longitud;
    }

    public int getId_calle() {
        return id_calle;
    }

    public void setId_calle(int id_calle) {
        this.id_calle = id_calle;
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getNombre_m() {
        return nombre_m;
    }

    public void setNombre_m(String nombre_m) {
        this.nombre_m = nombre_m;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
