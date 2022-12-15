package expresscorreos.model;

public class Usuario {
    private int id_usuario;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private int id_direccion;
    private int autoriza;

    public Usuario(int id_usuario, String nombre, String apellidos, String dni, String email, int id_direccion, int autoriza) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.id_direccion = id_direccion;
        this.autoriza = autoriza;
    }

    public int getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public int getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(int autoriza) {
        this.autoriza = autoriza;
    }
}
