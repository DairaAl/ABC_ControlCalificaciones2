//Les falta el encabezado

package controlcalificaciones;

public class alumno {

    private char grupo;
    private String idAlumno;
    private String nombre;
    private int semestre;

    public alumno() {

    }

    public void finalize() throws Throwable {

    }

    public char getGrupo() {
        return grupo;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public void setIdAlumno(String id) {
        this.idAlumno = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}

