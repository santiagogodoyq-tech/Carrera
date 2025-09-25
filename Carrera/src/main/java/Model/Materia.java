package Model;
import java.util.ArrayList;
public abstract class Materia {
    public String codigo;
    public String nombre;
    public int horaSemana;
    public int cantidadCreditos;
    public String semestreEsperado;
    public Profesor profesor;
    public ArrayList<Estudiante>listaEstudiantes;
    public ArrayList<Profesor> listaProfesores;
    public Materia(String codigo, String nombre, int horaSemana, int cantidadCreditos, String semestreEsperado, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horaSemana = horaSemana;
        this.cantidadCreditos = cantidadCreditos;
        this.semestreEsperado = semestreEsperado;
        this.profesor = profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoraSemana() {
        return horaSemana;
    }

    public void setHoraSemana(int horaSemana) {
        this.horaSemana = horaSemana;
    }

    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }

    public String getSemestreEsperado() {
        return semestreEsperado;
    }

    public void setSemestreEsperado(String semestreEsperado) {
        this.semestreEsperado = semestreEsperado;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
