//--------------------------------------------
//Programa: Login
//Fecha: 12/10/2016
//Autor: Petra Almanza Lobatos
//Tamaño: 17LOC
//--------------------------------------------
package controlcalificacionesv2;

import java.sql.*;

public class bdUsuario {

    usuario myUsuario = new usuario();
    bdConector mySQL;
    String query;

    public usuario login(int id) {
        mySQL = new bdConector();
        mySQL.connect();
        query = "SELECT * FROM usuario WHERE idUsuario=" + myUsuario.getId() + ";";
        String[] mResult = mySQL.executeQuery(query);
        if (mResult.length != 0) {
            myUsuario.setId(Integer.parseInt(mResult[0]));
            myUsuario.setNombre(mResult[1]);
            myUsuario.setContraseña(mResult[2]);
            myUsuario.setTipoUsuario(Integer.parseInt(mResult[3]));
            return myUsuario;
        } else {
            return myUsuario;
        }
    }
}
