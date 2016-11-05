//--------------------------------------------
//Programa: bajaAlumno
//Fecha: 04/11/2016
//Autor: Petra Almanza Lobatos
//Tamaño: 13LOC
//--------------------------------------------
//Cada quien poner su encabezado con la parte que le toco y el total de LOC que realizaron.

package controlcalificaciones;

import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class bdAlumno{

	public bdAlumno(){

	}
	public void finalize() throws Throwable {

	}
	public boolean agregarAlumno(alumno mAlumno){
            String SQL = "INSERT INTO alumno (idAlumno, nombre, semestre, grupo) values"
                    + "("+mAlumno.getIdAlumno()+", '"+mAlumno.getNombre()+"', "+mAlumno.getSemestre()+""
                    + ", '"+mAlumno.getGrupo()+"')";
            //JOptionPane.showMessageDialog(null, SQL);
            boolean correcto = false;
            try{
                bdConexion mBD = new bdConexion();
                mBD.conectar();
                mBD.ejecutarActualizacion(SQL);
                correcto = true;
                mBD.desconectar(mBD.getConexion());
            }catch(Exception e){
                System.out.print(e);
                correcto = false;
            }
            return correcto;
	}

	public ArrayList consultarAlumno(){
            String SQL = "SELECT * FROM alumno";
            ResultSet alumnos;
            ArrayList lista = new ArrayList();
            alumno nAlumno;
            try{
                bdConexion mBD = new bdConexion();
                mBD.conectar();
                alumnos=mBD.ejecutarConsulta(SQL);
                while(alumnos.next()){
                    nAlumno=new alumno();
                    nAlumno.setIdAlumno(alumnos.getString("idAlumno"));
                    nAlumno.setNombre(alumnos.getString("nombre"));
                    nAlumno.setSemestre(Integer.parseInt(alumnos.getString("semestre")));
                    nAlumno.setGrupo(alumnos.getString("grupo").charAt(0));
                    lista.add(nAlumno);
                }
                mBD.desconectar(mBD.getConexion());
            }catch(Exception e){
                System.out.print(e);
            }
		return lista;
	}
  public ArrayList consultaFiltroAlumno(String busqueda){
            String SQL = "SELECT *FROM alumno WHERE idAlumno LIKE '%" + busqueda + "%' " 
                + "OR nombre LIKE '%" + busqueda + "%' "
                + "OR semestre LIKE '%" + busqueda + "%'"
                + "OR grupo LIKE '%" + busqueda + "%'";
            ResultSet alumnos;
            ArrayList lista = new ArrayList();
            alumno nAlumno;
            try{
                bdConexion mBD = new bdConexion();
                mBD.conectar();
                alumnos=mBD.ejecutarConsulta(SQL);
                while(alumnos.next()){
                    nAlumno=new alumno();
                    nAlumno.setIdAlumno(alumnos.getString("idAlumno"));
                    nAlumno.setNombre(alumnos.getString("nombre"));
                    nAlumno.setSemestre(Integer.parseInt(alumnos.getString("semestre")));
                    nAlumno.setGrupo(alumnos.getString("grupo").charAt(0));
                    lista.add(nAlumno);
                }
                mBD.desconectar(mBD.getConexion());
            }catch(Exception e){
                System.out.print(e);
            }
            
		return lista;
	}
	public boolean eliminarAlumno(alumno mAlumno){
            String SQL = "DELETE FROM alumno WHERE idAlumno='"+mAlumno.getIdAlumno()+"';";
            bdConexion mBD = new bdConexion();
            boolean comprovacion=false;
            try{
                //1.- Conectarse a la base de datos.
                mBD.conectar();
                //2.-Realizar la consulta para eliminar el registro de ba BD con el id enviado.
                mBD.ejecutarActualizacion(SQL);
                comprovacion =true;
            }catch(Exception e){
                System.out.print(e);
                comprovacion =false;
            }
            //3.-Cerrar la conexion.
            mBD.desconectar(mBD.getConexion());
            //4.-Retornar un booleano confirmando o negando la correcta eliminacion del registro.
            return comprovacion;
	}

	public boolean modificarAlumno(alumno mAlumno){
		return false;
	}
}
