package App;
import Model.*;

import java.util.ArrayList;
import java.util.Optional;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String materiaBuscada = JOptionPane.showInputDialog(null, "ingrese la materia que desea buscar");


     Carrera carrera = new Carrera( "ingenieria ");
Profesor profesor3 = new ProfesorPlanta("1093", "sofia arbelaez", "otro titulo", 130, "ninguna", false);
     Profesor profesor2 = new ProfesorPlanta("1424", "antonio nariño", "algun titulo", 19, "profesor", false);
        Profesor profesor = new ProfesorPlanta("1342","Juan Albert","Ingeniero de Software",10,"ciberseguridad",false);
        Materia materia = new MateriaPractica("1341","programacion",10,11,"2",profesor,4,7);
        carrera.registrarMaterias(materia);
        carrera.profesorProgramacion(materia);


    }

}