//--------------------------------------------
//Programa: Login
//Fecha: 30/10/2016
//Autor: Petra Almanza Lobatos
//Tamaño: 18LOC
//--------------------------------------------
package BD;

import Entidades.usuario;
import java.sql.*;

public class bdUsuario {

    usuario myUsuario = new usuario();
    bdConexion mySQL;
    String query;

    public usuario login(int id) throws SQLException, InstantiationException, IllegalAccessException {
        mySQL = new bdConexion();
        Connection mCon = mySQL.conectar();
        query = "SELECT * FROM usuario WHERE idUsuario=" + id + ";";
        ResultSet mResult = mySQL.ejecutarConsulta(query);
        System.out.println(mResult.getRow());
        while (mResult.next()) {
            myUsuario.setId(Integer.parseInt(mResult.getString("idUsuario")));
            myUsuario.setContraseña(mResult.getString("Contrasena"));
            myUsuario.setTipoUsuario(Integer.parseInt(mResult.getString("tipoUsuario_idUsuario")));
        }
        mySQL.desconectar(mCon);
        return myUsuario;
    }
}
