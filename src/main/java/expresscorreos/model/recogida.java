package expresscorreos.model;
import java.util.Date;

public class recogida {
    private int id_recogida;
    private int id_usuario;
    private Date fecha_recogida;
    private int id_direccion;
    private String dni_cartero;

    public recogida(int id_recogida, int id_usuario, Date fecha_recogida, int id_direccion, String dni_cartero) {
        this.id_recogida = id_recogida;
        this.id_usuario = id_usuario;
        this.fecha_recogida = fecha_recogida;
        this.id_direccion = id_direccion;
        this.dni_cartero = dni_cartero;
    }

    public int getId_recogida() {
        return id_recogida;
    }

    public void setId_recogida(int id_recogida) {
        this.id_recogida = id_recogida;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getFecha_recogida() {
        return fecha_recogida;
    }

    public void setFecha_recogida(Date fecha_recogida) {
        this.fecha_recogida = fecha_recogida;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getDni_cartero() {
        return dni_cartero;
    }

    public void setDni_cartero(String dni_cartero) {
        this.dni_cartero = dni_cartero;
    }
}
