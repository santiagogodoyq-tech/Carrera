package Model;

public class ProfesorPlanta extends Profesor {
    private String dedicacion;
    private boolean participaInvestigacion;

    public ProfesorPlanta(String id, String nombre, String tituloAcademico, int aniosExperiencia,
                          String dedicacion, boolean participaInvestigacion) {
        super(id, nombre, tituloAcademico, aniosExperiencia);
        this.dedicacion = dedicacion;
        this.participaInvestigacion = participaInvestigacion;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public boolean isParticipaInvestigacion() {
        return participaInvestigacion;
    }

    public void setParticipaInvestigacion(boolean participaInvestigacion) {
        this.participaInvestigacion = participaInvestigacion;
    }

    @Override
    public String toString() {
        return "ProfesorPlanta{" +
                "dedicacion='" + dedicacion + '\'' +
                ", participaInvestigacion=" + participaInvestigacion +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", titulo='" + titulo + '\'' +
                ", añosDeExperiencia=" + añosDeExperiencia +
                ", listaMaterias=" + listaMaterias.stream()
                .map(Materia::getNombre)
                .toList() +
                '}'+"\n";
    }
}
