package expresscorreos.model;

public class Centro_de_clasificacion {
    private int codigo;
    private int num_max_c;
    private int num_max_p;
    private int id_oficina;

    public Centro_de_clasificacion(int codigo, int num_max_c, int num_max_p, int id_oficina) {
        this.codigo = codigo;
        this.num_max_c = num_max_c;
        this.num_max_p = num_max_p;
        this.id_oficina = id_oficina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNum_max_c() {
        return num_max_c;
    }

    public void setNum_max_c(int num_max_c) {
        this.num_max_c = num_max_c;
    }

    public int getNum_max_p() {
        return num_max_p;
    }

    public void setNum_max_p(int num_max_p) {
        this.num_max_p = num_max_p;
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }
}
