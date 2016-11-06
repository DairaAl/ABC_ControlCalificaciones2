//Falta encabezado.

package controlcalificaciones;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class bdConexion {

    private Statement comando;
    Connection con = null;

    public Connection conectar() throws SQLException, InstantiationException, IllegalAccessException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver").newInstance();
            //Class.forName("com,mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbcontrolcalificacion", "root", "");
            comando = con.createStatement();
            System.out.println("conexion establecida");
        } catch (ClassNotFoundException e) {
            System.out.println("error de conexion" + e);
        }
        return con;
    }

    public Connection getConexion() {
        return con;
    }

    /**
     * Ejecuta una consulta SQL con SELECT*
     */
    public ResultSet ejecutarConsulta(String instruccionQL) throws SQLException {
        ResultSet resultado = this.comando.executeQuery(instruccionQL);
        return resultado;
    }

    /**
     * Ejecuta una comando DML como INSERt, UPDATE o DELETE o tambien DDL como
     * CREATE, DROP, ALTER*
     */
    public int ejecutarActualizacion(String instruccionDML) throws SQLException {
        int i;
        i = this.comando.executeUpdate(instruccionDML);
        return i;
    }

    public void desconectar(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
