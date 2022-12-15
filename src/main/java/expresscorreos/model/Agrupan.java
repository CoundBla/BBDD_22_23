package expresscorreos.model;

public class Agrupan {
    private int id_segmento;
    private int id_area_envio;

    public int getId_segmento() {
        return id_segmento;
    }

    public void setId_segmento(int id_segmento) {
        this.id_segmento = id_segmento;
    }

    public int getId_area_envio() {
        return id_area_envio;
    }

    public void setId_area_envio(int id_area_envio) {
        this.id_area_envio = id_area_envio;
    }

    public Agrupan(int id_segmento, int id_area_envio) {
        this.id_segmento = id_segmento;
        this.id_area_envio = id_area_envio;
    }
}
