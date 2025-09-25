package Model;

public class ProfesorCatedra extends Profesor {
public int numeroHorasTrabajo;
public Empresa empresa;
public ProfesorCatedra(String identificador, String nombre, String titulo, int añosDeExperiencia, int numeroHorasTrabajo, Empresa empresa ){
    super(identificador, nombre, titulo, añosDeExperiencia);
    this.numeroHorasTrabajo = numeroHorasTrabajo;
    this.empresa = empresa;
}

}
