package Model;

import java.util.ArrayList;
import java.util.Optional;

public class Carrera {
    private String nombre;
    private int numeroSemestres;
    private ArrayList<Materia> listaMaterias;
    private ArrayList<Profesor> listaProfesores;
    private ArrayList<Estudiante> listaEstudiantes;

    public Carrera(String nombre, int numeroSemestre, ArrayList<Materia> listaMaterias, ArrayList<Profesor> listaProfesores, ArrayList<Estudiante> listaEstudiantes) {
        this.nombre = nombre;
        this.numeroSemestres = numeroSemestres;
        this.listaMaterias = listaMaterias;
        this.listaProfesores = listaProfesores;
        this.listaEstudiantes = listaEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSemestres() {
        return numeroSemestres;
    }

    public void setNumeroSemestres(int numeroSemestres) {
        this.numeroSemestres = numeroSemestres;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        listaProfesores = listaProfesores;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        listaEstudiantes = listaEstudiantes;
    }


    /// ///////////////////////////////////////////////////////////////////


    public void agregarEstudiante(Estudiante estudiante) {
        String respuesta = "";
        Optional<Estudiante> mascotaBuscada = Optional.empty();
        mascotaBuscada = buscarEstudiante(estudiante.getId());
        if (mascotaBuscada.isEmpty()) {
            listaEstudiantes.add(estudiante);
            respuesta = "Se ha registrado el estudiante " + estudiante.getNombre() + " al programa";
        } else {
            respuesta = "El estudiante " + estudiante.getNombre() + " ya esta registrada";
        }
        System.out.println(respuesta);
    }

    public Optional<Estudiante> buscarEstudiante(String codigo) {
        return listaEstudiantes.stream().filter(animal -> animal.getId().equals(codigo)).findFirst();
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        Optional<Estudiante> estudianteBuscado = buscarEstudiante(estudiante.getId());
        if (estudianteBuscado.isPresent()) {
            listaEstudiantes.remove(estudiante);
            System.out.println("Se ha removido al estudiante "
                    + estudianteBuscado + " de la universidad.");
        } else {
            System.out.println("El estudiante con código " + estudiante.getId() + " no está registrado.");
        }
    }
}
