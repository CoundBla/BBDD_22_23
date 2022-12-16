import java.awt.*;
import java.sql.*;
import java.util.LinkedList;

import expresscorreos.model.Cartero;

public class Main {
    // @TODO: Sustituya xxxx por los parámetros de su conexión

    private static final String DB_SERVER = "localhost";

    private static final int DB_PORT = 3306;

    private static final String DB_NAME = "express_correos";

    private static final String DB_USER = "root";

    private static final String DB_PASS = "";

    private static Connection conn;

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);

        // @TODO pruebe sus funciones
        nuevoCartero("22334455A","Pablo","Garcia Hernandez");
        carterosRepartoCochePeriodo(7);

        conn.close();
    }

    // @TODO resuelva las siguientes funciones...

    public static void nuevoCartero(String DNI, String nombre, String apellidos) {
        // @TODO: complete este método para que cree un nuevo cartero en la base de datos
        int existDNI = 0;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT 1 as exist from CARTERO where dni_cartero = ?");
            stmt.setString(1,DNI);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                existDNI = rs.getInt("exist");
            }
            rs.close();
            if(existDNI>=1){
                throw new Exception("El Cartero introducido ya existe");
            }
            stmt = conn.prepareStatement("INSERT INTO CARTERO (dni_cartero, nombre, apellidos) VALUES (?, ? ,?)");

            stmt.setString(1, DNI);
            stmt.setString(2, nombre);
            stmt.setString(3, apellidos);
            stmt.executeUpdate();
            System.out.println("Cartero introducido correctamente");
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }

    public static LinkedList<Cartero> carterosRepartoCochePeriodo(int periodo) {
        // @TODO: complete este método para que muestre por pantalla una lista de carteros que han
        // realizado un reparto con coche en el periodo comprendido por los últimos "periodo" días
        // (implementar para periodo=7)
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada Cartero que cumpla con las condiciones,
        // y añadirlos a la lista
        LinkedList<Cartero> carteros=new LinkedList<>();
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT c.dni_cartero,c.nombre,c.apellidos FROM CARTERO c INNER JOIN REPARTO r ON r.dni_cartero=c.dni_cartero WHERE r.fecha_reserva BETWEEN date_add(sysdate(),interval -? day) AND sysdate()\n");
            stmt.setInt(1,periodo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String dni= rs.getString("dni_cartero");
                String nombre= rs.getString("nombre");
                String apellidos= rs.getString("apellidos");
                carteros.add(new Cartero(dni,nombre,apellidos));

            }
            rs.close();
            stmt.close();

        System.out.println("Carteros en el periodo: ");
        for(int i=0;i<carteros.size();i++){
            System.out.println(carteros.get(i).getDNI()+" "+carteros.get(i).getNombre()+" "+carteros.get(i).getApellidos());
        }
        }catch(Exception e){
            System.out.println("Error en la busqueda de carteros");
        }
        return carteros;
    }

    public static void oficinasAsociadasCalle(String calle) {
        // @TODO: complete este método para que muestre por pantalla una lista de las oficinas que
        // dan servicio a la C/Alcalá de Madrid.
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada Oficina que tenga asociada algún segmento de esa calle,
        // y añadirlos a la lista


    }

    public static void cochesSinUtilizarPeriodo(int periodo) {
        // @TODO: complete este método para que muestre por pantalla una lista de los coches que no se han
        // utilizado en los últimos "periodo" días (implementar para periodo=30)

    }

}
