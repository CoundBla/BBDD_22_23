package expresscorreos.model;

public class Area_de_envio {
    private int id_area_envio;
    private int id_oficina;
    private int id_padre;

    public Area_de_envio(int id_area_envio, int id_oficina, int id_padre) {
        this.id_area_envio = id_area_envio;
        this.id_oficina = id_oficina;
        this.id_padre = id_padre;
    }

    public int getId_area_envio() {
        return id_area_envio;
    }

    public void setId_area_envio(int id_area_envio) {
        this.id_area_envio = id_area_envio;
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }

    public int getId_padre() {
        return id_padre;
    }

    public void setId_padre(int id_padre) {
        this.id_padre = id_padre;
    }
}
