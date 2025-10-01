package Model;

public class EstudiantePosgrado extends Estudiante{
    private Educacion educacion;
    private String temaInvestigacion;
    public EstudiantePosgrado(String identificacion, String nombre, String id, String programaAcademico, int semestre, Educacion educacion, String temaInvestigacion, Profesor profesor) {
        super(nombre, id, programaAcademico, semestre);
        this.educacion = educacion;
        this.temaInvestigacion = temaInvestigacion;
    }

    public Educacion getEducacion() {
        return educacion;
    }

    public void setEducacion(Educacion educacion) {
        this.educacion = educacion;
    }

    public String getTemaInvestigacion() {
        return temaInvestigacion;
    }

    public void setTemaInvestigacion(String temaInvestigacion) {
        this.temaInvestigacion = temaInvestigacion;
    }

    @Override
    public String toString() {
        return "EstudiantePosgrado{" +
                "educacion=" + educacion +
                ", temaInvestigacion='" + temaInvestigacion + '\'' +
                ", listaMaterias=" + listaMaterias +
                '}';
    }
}
