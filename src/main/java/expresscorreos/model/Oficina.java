package expresscorreos.model;

public class Oficina {
    private int id_oficina;
    private String nombre_oficina;
    private String nombre_m;
    private String id_direccion;

    public Oficina(int id_oficina, String nombre_oficina, String nombre_m, String id_direccion) {
        this.id_oficina = id_oficina;
        this.nombre_oficina = nombre_oficina;
        this.nombre_m = nombre_m;
        this.id_direccion = id_direccion;
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }

    public String getNombre_oficina() {
        return nombre_oficina;
    }

    public void setNombre_oficina(String nombre_oficina) {
        this.nombre_oficina = nombre_oficina;
    }

    public String getNombre_m() {
        return nombre_m;
    }

    public void setNombre_m(String nombre_m) {
        this.nombre_m = nombre_m;
    }

    public String getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(String id_direccion) {
        this.id_direccion = id_direccion;
    }
}
