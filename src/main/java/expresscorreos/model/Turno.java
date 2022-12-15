package expresscorreos.model;

public class Turno {
    private int id_turno;
    private String hora_entrada;
    private String hora_salida;
    private String tipo_turno;

    public Turno(int id_turno, String hora_entrada, String hora_salida, String tipo_turno) {
        this.id_turno = id_turno;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.tipo_turno = tipo_turno;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getTipo_turno() {
        return tipo_turno;
    }

    public void setTipo_turno(String tipo_turno) {
        this.tipo_turno = tipo_turno;
    }
}
