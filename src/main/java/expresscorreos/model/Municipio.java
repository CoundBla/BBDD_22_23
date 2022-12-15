package expresscorreos.model;

public class Municipio {
    private String nombre_m;
    private String provincia;

    public Municipio(String nombre_m, String provincia) {
        this.nombre_m = nombre_m;
        this.provincia = provincia;
    }

    public String getNombre_m() {
        return nombre_m;
    }

    public void setNombre_m(String nombre_m) {
        this.nombre_m = nombre_m;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
