package App;
import Model.*;

import java.util.ArrayList;
import java.util.Optional;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

     Carrera carrera = new Carrera( "ingenieria ");
Profesor profesor3 = new ProfesorPlanta("1093", "sofia arbelaez", "ingeniero Electronico", 4, "administrador de sistemas", false);
     Profesor profesor2 = new ProfesorPlanta("1424", "antonio nariño", "lenguas modernas", 19, "profesor", false);
        Profesor profesor = new ProfesorPlanta("1342","Juan Albert","Ingeniero de Software",10,"ciberseguridad",false);
        Materia materia = new MateriaPractica("1341","programacion",10,11,2,profesor,4,3);
        Materia materia1 = new MateriaTeorica("1432412","ingles I",6,4,2,profesor2);
        Materia materia2 = new MateriaPractica("157687","Fundamentos Electronica",7,10,2,profesor3,6,5);
        Estudiante estudiante = new Estudiante("Sara Benjumea", "1091","ingenieria en sistemas", 2);
        Estudiante estudiante1 = new Estudiante("Juan Campos", "10925","ingenieria en sistemas", 2);
        Estudiante estudiante2 = new Estudiante("Santiago Godoy", "10924","ingenieria en sistemas", 2);
        Estudiante estudiante3 = new Estudiante("Isabela Flores", "1092356","lenguas modernas", 3);
        Estudiante estudiante4 = new Estudiante("Yesica Arias", "1092755","ingenieria industrial", 4);
        Estudiante estudiante5 = new Estudiante("Camilo Gomez", "10910983","ingenieria electronica", 2);
        carrera.registrarMaterias(materia);
        carrera.registrarMaterias(materia1);
        carrera.agregarEstudiante(estudiante);
        carrera.agregarEstudiante(estudiante1);
        carrera.agregarEstudiante(estudiante2);
        carrera.agregarEstudiante(estudiante3);
        carrera.agregarEstudiante(estudiante4);
        carrera.agregarEstudiante(estudiante5);
        carrera.agregarProfesor(profesor);
        carrera.agregarProfesor(profesor2);
        carrera.agregarProfesor(profesor3);
        carrera.registrarMaterias(materia1);
        carrera.registrarMaterias(materia2);
        carrera.asignarMateriaEst(materia, estudiante);
        carrera.asignarMateriaEst(materia, estudiante1);
        carrera.asignarMateriaEst(materia, estudiante2);
        carrera.asignarMateriaEst(materia1, estudiante);
        carrera.asignarMateriaEst(materia1, estudiante1);
        carrera.asignarMateriaEst(materia1, estudiante2);
        carrera.asignarMateriaEst(materia1, estudiante3);
        carrera.asignarMateriaEst(materia1, estudiante4);
        carrera.asignarMateriaEst(materia1, estudiante5);
        carrera.asignarMateriaEst(materia2, estudiante);
        carrera.asignarMateriaEst(materia2, estudiante1);
        carrera.asignarMateriaEst(materia2, estudiante2);
        carrera.asignarMateriaEst(materia2, estudiante4);
        carrera.asignarMateriaEst(materia2, estudiante5);
        carrera.asignarMateriaPro(materia, profesor);
        carrera.asignarMateriaPro(materia1, profesor2);
        carrera.asignarMateriaPro(materia2, profesor3);
        carrera.jOption(""+carrera.profesoresCatedra());
        carrera.jOption(""+carrera.calcularCreditosEstudianteSemestre(estudiante, 2));
        carrera.jOption(""+carrera.horasMateria(materia));
    }

}