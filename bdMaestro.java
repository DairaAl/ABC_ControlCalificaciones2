//--------------------------------------------
//Programa: bdMaestro
//Fecha: 05/11/2016
//Autor: Petra Almanza Lobatos
//Tamaño: 29LOC
//--------------------------------------------
package BD;

import Entidades.maestro;
import java.util.ArrayList;

public class bdMaestro {

    public boolean agregarMaestro(maestro maestro) {
        return false;
    }

    public ArrayList consultarMaestro() {
        return null;
    }

    public boolean eliminarMaestro(maestro mMaestro) {
        //1-Realizar la consulta SQL.
        String SQL = "DELETE FROM maestro WHERE usuario_idUsuario='" + mMaestro.getId() + "';";
        bdConexion mBD = new bdConexion();
        boolean comprovacion = false;
        try {
            //2.- Conectarse a la base de datos.
            mBD.conectar();
            //3.-Realizar la consulta para eliminar el registro de ba BD con el id enviado.
            mBD.ejecutarActualizacion(SQL);
            comprovacion = true;
        } catch (Exception e) {
            System.out.print(e);
            comprovacion = false;
        }
        //4.-Cerrar la conexion.
        mBD.desconectar(mBD.getConexion());
        //5.-Retornar un booleano confirmando o negando la correcta eliminacion del registro.
        return comprovacion;
    }

    public boolean modificarMaestro(maestro maestro) {
        return false;
    }
}//end bdMaestro
