package expresscorreos.model;

import java.util.Date;

public class Trabaja {
    private Date fecha;
    private int id_oficina;
    private int id_turno;
    private String dni_cartero;

    public Trabaja(Date fecha, int id_oficina, int id_turno, String dni_cartero) {
        this.fecha = fecha;
        this.id_oficina = id_oficina;
        this.id_turno = id_turno;
        this.dni_cartero = dni_cartero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public String getDni_cartero() {
        return dni_cartero;
    }

    public void setDni_cartero(String dni_cartero) {
        this.dni_cartero = dni_cartero;
    }
}
