package expresscorreos.model;

public class Asociado {
    private int id_area_envio;
    private String dni_cartero;

    public Asociado(int id_area_envio, String dni_cartero) {
        this.id_area_envio = id_area_envio;
        this.dni_cartero = dni_cartero;
    }

    public int getId_area_envio() {
        return id_area_envio;
    }

    public void setId_area_envio(int id_area_envio) {
        this.id_area_envio = id_area_envio;
    }

    public String getDni_cartero() {
        return dni_cartero;
    }

    public void setDni_cartero(String dni_cartero) {
        this.dni_cartero = dni_cartero;
    }
}
