package expresscorreos.model;

public class Coche {
    private String matricula;
    private float capcidad;
    private int id_oficina;

    public Coche(String matricula, float capcidad, int id_oficina) {
        this.matricula = matricula;
        this.capcidad = capcidad;
        this.id_oficina = id_oficina;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getCapcidad() {
        return capcidad;
    }

    public void setCapcidad(float capcidad) {
        this.capcidad = capcidad;
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }
}
