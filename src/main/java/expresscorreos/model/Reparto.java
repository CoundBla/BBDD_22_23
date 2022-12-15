package expresscorreos.model;
import java.util.Date;


public class Reparto {
    private Date fecha_alta;
    private int num_cartas;
    private int id_reparto;
    private int peso;
    private int id_ruta;
    private String dni_cartero;
    private String matricula;
    private Date fecha_reserva;

    public Reparto(Date fecha_alta, int num_cartas, int id_reparto, int peso, int id_ruta, String dni_cartero, String matricula, Date fecha_reserva) {
        this.fecha_alta = fecha_alta;
        this.num_cartas = num_cartas;
        this.id_reparto = id_reparto;
        this.peso = peso;
        this.id_ruta = id_ruta;
        this.dni_cartero = dni_cartero;
        this.matricula = matricula;
        this.fecha_reserva = fecha_reserva;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public int getNum_cartas() {
        return num_cartas;
    }

    public void setNum_cartas(int num_cartas) {
        this.num_cartas = num_cartas;
    }

    public int getId_reparto() {
        return id_reparto;
    }

    public void setId_reparto(int id_reparto) {
        this.id_reparto = id_reparto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getDni_cartero() {
        return dni_cartero;
    }

    public void setDni_cartero(String dni_cartero) {
        this.dni_cartero = dni_cartero;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }
}
