package Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Optional;

public record Carrera(String nombre,ArrayList<Materia> listaMaterias, ArrayList<Profesor> listaProfesores, ArrayList<Estudiante> listaEstudiantes) {

    public Carrera(String nombre){
        this(nombre,
        new ArrayList<>(),
        new ArrayList<>(),
        new ArrayList<>());
    }
    /// ///////////////////////////////////////////////////////////////////


    public void agregarEstudiante(Estudiante estudiante) {
        String respuesta = "";
        Optional<Estudiante> estudianteEncontrado = Optional.empty();
        estudianteEncontrado = buscarEstudiante(estudiante.getId());
        if (estudianteEncontrado.isEmpty()) {
            listaEstudiantes.add(estudiante);
            respuesta = "Se ha registrado el estudiante " + estudiante.getNombre() + " al programa";
        } else {
            respuesta = "El estudiante " + estudiante.getNombre() + " ya esta registrado";
        }
        System.out.println(respuesta);
    }

    public Optional<Estudiante> buscarEstudiante(String codigo) {
        return listaEstudiantes.stream().filter(estudiante -> estudiante.getId().equals(codigo)).findFirst();
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
    public void agregarProfesor(Profesor profesor) {
        String respuesta = "";
        Optional<Profesor> profesorEncontrado = Optional.empty();
        profesorEncontrado = buscarProfesor(profesor.getId());
        if (profesorEncontrado.isEmpty()) {
            listaProfesores.add(profesor);
            respuesta = "Se ha registrado el profesor " + profesor.getNombre() + " al programa";
        } else {
            respuesta = "El profesor " + profesor.getNombre() + " ya esta registrado";
        }
        System.out.println(respuesta);
    }

    public void eliminarProfesor(Profesor profesor) {
        Optional<Profesor> profesorBuscado = buscarProfesor(
                profesor.getId());
        if (profesorBuscado.isPresent()) {
            listaEstudiantes.remove(profesor);
            System.out.println("Se ha removido al profesor "
                    + profesorBuscado + " de la universidad.");
        } else {
            System.out.println("El estudiante con código " + estudiante.getId() + " no está registrado.");
        }
    }

    public Optional<Profesor> buscarProfesor(String codigo) {
        return listaProfesores.stream().filter(profesor -> profesor.getId().equals(codigo)).findFirst();
    }

    //obtener profesores
    //obtener profesores de programacion

    public Optional<Profesor>profesorProgramacion (Materia materiaBuscada){
        Optional<Profesor> flag = listaProfesores.stream().filter(profesor -> profesor.getListaMaterias().equals(materiaBuscada)).findFirst();
        if (flag.isEmpty()) {
            JOptionPane.showMessageDialog(null, "el profesor no es el profesor de programcion");
        }else{
            JOptionPane.showMessageDialog(null, "el profesor"+materiaBuscada.getProfesor().getNombre()+"si es profesor de programaciom");
        }
        return flag;
    }

    public Optional<Materia> buscarMateria(String codigo){
        return listaMaterias.stream().filter(materia -> materia.getCodigo().equals(codigo)).findFirst();
    }
    public void registrarMaterias(Materia materia){
        String respuesta = "";
        Optional<Materia> materiaEncontrada = Optional.empty();
        materiaEncontrada = buscarMateria(materia.getCodigo());
        if (materiaEncontrada.isEmpty()) {
            listaMaterias.add(materia);
            respuesta = "Se ha registrado la materia " + materia.getNombre() + " al programa";
        } else {
            respuesta = "El materia " + materia.getNombre() + " ya esta registrado";
        }
        System.out.println(respuesta);
    }
    public void asignarMateriaPro(Materia materia, Profesor profesor){
        profesor.listaMaterias.add(materia);
        materia.setProfesor(profesor);
    }
    public void asignarMateriaEst(Materia materia, Estudiante estudiante){
        estudiante.listaMaterias.add(materia);
        materia.listaEstudiantes.add(estudiante);
    }
    // una funcion que consulte todas las materias de un semestre en especifico

    public int semestreBuscado (int semestreEsperado){
        

    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", listaMaterias=" + listaMaterias +
                ", listaProfesores=" + listaProfesores +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}


