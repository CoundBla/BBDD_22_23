import java.sql.*;
import java.util.List;
import expresscorreos.model.Cartero;

public class Main {
    // @TODO: Sustituya xxxx por los parámetros de su conexión

    private static final String DB_SERVER = "localhost";

    private static final int DB_PORT = 3306;

    private static final String DB_NAME = "express_correos";

    private static final String DB_USER = "root";

    private static final String DB_PASS = "123789";

    private static Connection conn;

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);

        // @TODO pruebe sus funciones

        conn.close();
    }

    // @TODO resuelva las siguientes funciones...

    public static void nuevoCartero(String DNI, String nombre, String apellidos) {
        // @TODO: complete este método para que cree un nuevo cartero en la base de datos
        int existDNI = 0;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT 1 as exist from cartero where dni_cartero = ?");
            stmt.setString(1,DNI);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                existDNI = rs.getInt("exist");
            }
            rs.close();
            if(existDNI>=1){
                throw new Exception("El DNI introducido ya existe");
            }
            stmt = conn.prepareStatement("INSERT INTO cartero (dni_cartero, nombre, apellidos) VALUES (?, ? ,?)");

            stmt.setString(1, DNI);
            stmt.setString(2, nombre);
            stmt.setString(3, apellidos);
            stmt.executeUpdate();
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }

    public static List<Cartero> carterosRepartoCochePeriodo(int periodo) {
        // @TODO: complete este método para que muestre por pantalla una lista de carteros que han
        // realizado un reparto con coche en el periodo comprendido por los últimos "periodo" días
        // (implementar para periodo=7)
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada Cartero que cumpla con las condiciones,
        // y añadirlos a la lista

        return new List<Cartero>() {
        };
    }

    public static List<Oficina> oficinasAsociadasCalle(String calle) {
        // @TODO: complete este método para que muestre por pantalla una lista de las oficinas que
        // dan servicio a la C/Alcalá de Madrid.
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada Oficina que tenga asociada algún segmento de esa calle,
        // y añadirlos a la lista

        return ;
    }

    public static String cochesSinUtilizarPeriodo(int periodo) {
        // @TODO: complete este método para que muestre por pantalla una lista de los coches que no se han
        // utilizado en los últimos "periodo" días (implementar para periodo=30)
try {
};
}
        return new String();


}
