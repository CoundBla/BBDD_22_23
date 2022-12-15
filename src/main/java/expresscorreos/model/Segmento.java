package expresscorreos.model;

public class Segmento {
    private int id_segmento;
    private int num_ini;
    private int num_fin;
    private int id_calle;
    private int id_ruta;
    private int num_orden;

    public Segmento(int id_segmento, int num_ini, int num_fin, int id_calle, int id_ruta, int num_orden) {
        this.id_segmento = id_segmento;
        this.num_ini = num_ini;
        this.num_fin = num_fin;
        this.id_calle = id_calle;
        this.id_ruta = id_ruta;
        this.num_orden = num_orden;
    }

    public int getId_segmento() {
        return id_segmento;
    }

    public void setId_segmento(int id_segmento) {
        this.id_segmento = id_segmento;
    }

    public int getNum_ini() {
        return num_ini;
    }

    public void setNum_ini(int num_ini) {
        this.num_ini = num_ini;
    }

    public int getNum_fin() {
        return num_fin;
    }

    public void setNum_fin(int num_fin) {
        this.num_fin = num_fin;
    }

    public int getId_calle() {
        return id_calle;
    }

    public void setId_calle(int id_calle) {
        this.id_calle = id_calle;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public int getNum_orden() {
        return num_orden;
    }

    public void setNum_orden(int num_orden) {
        this.num_orden = num_orden;
    }

}
