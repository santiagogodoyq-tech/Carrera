package Model;

public class ProfesorCatedra extends Profesor {
public int numeroHorasTrabajo;
public Empresa empresa;
public ProfesorCatedra(String id, String nombre, String titulo, int añosDeExperiencia, int numeroHorasTrabajo, Empresa empresa ){
    super(id, nombre, titulo, añosDeExperiencia);
    this.numeroHorasTrabajo = numeroHorasTrabajo;
    this.empresa = empresa;
}

    public int getNumeroHorasTrabajo() {
        return numeroHorasTrabajo;
    }

    public void setNumeroHorasTrabajo(int numeroHorasTrabajo) {
        this.numeroHorasTrabajo = numeroHorasTrabajo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "ProfesorCatedra{" +
                "numeroHorasTrabajo=" + numeroHorasTrabajo +
                ", empresa=" + empresa +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", titulo='" + titulo + '\'' +
                ", añosDeExperiencia=" + añosDeExperiencia +
                ", listaMaterias=" + listaMaterias +
                '}';
    }
}
