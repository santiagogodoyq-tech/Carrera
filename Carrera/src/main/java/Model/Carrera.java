package Model;

import javax.swing.*;
import java.util.*;
import java.util.Optional;

public record Carrera(String nombre,ArrayList<Materia> listaMaterias, ArrayList<Profesor> listaProfesores, ArrayList<Estudiante> listaEstudiantes) {

    public Carrera(String nombre){
        this(nombre,
        new ArrayList<>(),
        new ArrayList<>(),
        new ArrayList<>());
    }
    /////////////////////////////////////////////////////////////////////////


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
            System.out.println("El estudiante con código " + profesor.getId() + " no está registrado.");
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

    /**
     * coso pa buscar materias de un semestre en especifico
      * @param semestre
     * @return
     */
    public ArrayList<Materia> SemestreBuscado(int semestre) {
        return new ArrayList<>(
                listaMaterias.stream().filter(materia -> materia.getSemestreEsperado() == semestre).toList());
    }


            //saca el nombre de todos los estudiantes de la materia
    public String estudiantesMateria(Materia materia){
        return listaMaterias.stream().filter(x -> x.getListaEstudiantes() != null).flatMap(x -> x.getListaEstudiantes().stream()).findFirst().get().getNombre();
    }

    // calcular el total de olas semanales de una playa del caribe.

    public int horasMateria(Materia materia){
        return listaMaterias.stream().filter(m -> m.getCodigo().equals(materia.getCodigo())).mapToInt(Materia :: getHoraSemana).sum();
    }
   // cuantas catedras existen en un profesor
    public int profesoresCatedra(){
        return (int) listaProfesores.stream().filter(profesor -> profesor instanceof ProfesorCatedra).count();
    }
    public int horasSemanalesTotales (ArrayList<Materia>materiasALasQueQuiereSaberleLasHorasSemanales){
       return listaMaterias.stream().mapToInt( materia -> materia.getHoraSemana()).sum();
    }


    public int calcularCreditosSemestre  (Estudiante estudiante){

        return listaMaterias.stream().filter(materia -> materia.getListaEstudiantes().contains(estudiante)).mapToInt(materia :: getCantidadCreditos).sum();
        //
        public int calcularCreditosEstudianteSemestre(Estudiante estudiante, int semestre) {
            return listaEstudiantes.stream()
                    .filter(c -> c.getId().equals(estudiante.getId()))
                    .flatMap(c -> c.getListaMaterias().stream())   // 📌 expandimos las materias del estudiante
                    .filter(m -> m.getSemestre() == semestre)
                    .mapToInt(Materia::getCreditos)
                    .sum();
        }

    }



    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ",\n listaMaterias=" + listaMaterias +
                ",\n listaProfesores=" + listaProfesores +
                ",\n listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}


