package expresscorreos.model;
import java.util.Date;

public class Paquete {
    private String id_p;
    private String dimensiones;
    private int alto;
    private int ancho;
    private float peso;
    private String comentario;
    private int emisor_id;
    private int receptor_id;
    private int id_recogida;
    private int id_reparto;
    private Date fecha_entrega;

    public Paquete(String id_p, String dimensiones, int alto, int ancho, float peso, String comentario, int emisor_id, int receptor_id, int id_recogida, int id_reparto, Date fecha_entrega) {
        this.id_p = id_p;
        this.dimensiones = dimensiones;
        this.alto = alto;
        this.ancho = ancho;
        this.peso = peso;
        this.comentario = comentario;
        this.emisor_id = emisor_id;
        this.receptor_id = receptor_id;
        this.id_recogida = id_recogida;
        this.id_reparto = id_reparto;
        this.fecha_entrega = fecha_entrega;
    }

    public String getId_p() {
        return id_p;
    }

    public void setId_p(String id_p) {
        this.id_p = id_p;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
}
