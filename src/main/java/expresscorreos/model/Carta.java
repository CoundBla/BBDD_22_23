package expresscorreos.model;

import java.util.Date;

public class Carta {
    private String id_c;
    private String formato;
    private Date fecha_entrega;
    private String nombre_m;
    private int emisor_id;
    private int receptor_id;
    private int id_recogida;
    private int id_reparto;

    public Carta(String id_c, String formato, Date fecha_entrega, String nombre_m, int emisor_id, int receptor_id, int id_recogida, int id_reparto) {
        this.id_c = id_c;
        this.formato = formato;
        this.fecha_entrega = fecha_entrega;
        this.nombre_m = nombre_m;
        this.emisor_id = emisor_id;
        this.receptor_id = receptor_id;
        this.id_recogida = id_recogida;
        this.id_reparto = id_reparto;
    }

    public String getId_c() {
        return id_c;
    }

    public void setId_c(String id_c) {
        this.id_c = id_c;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getNombre_m() {
        return nombre_m;
    }

    public void setNombre_m(String nombre_m) {
        this.nombre_m = nombre_m;
    }

    public int getEmisor_id() {
        return emisor_id;
    }

    public void setEmisor_id(int emisor_id) {
        this.emisor_id = emisor_id;
    }

    public int getReceptor_id() {
        return receptor_id;
    }

    public void setReceptor_id(int receptor_id) {
        this.receptor_id = receptor_id;
    }

    public int getId_recogida() {
        return id_recogida;
    }

    public void setId_recogida(int id_recogida) {
        this.id_recogida = id_recogida;
    }

    public int getId_reparto() {
        return id_reparto;
    }

    public void setId_reparto(int id_reparto) {
        this.id_reparto = id_reparto;
    }
}
