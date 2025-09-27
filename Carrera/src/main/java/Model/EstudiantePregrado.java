package Model;

public class EstudiantePregrado extends Estudiante{
    private boolean beca;
    private float promedioAcumulado;
    public EstudiantePregrado(String identificacion, String nombre, String id, String programaAcademico, String semestre, boolean beca, float promedioAcumulado) {
        super(nombre, id, programaAcademico, semestre);
        this.beca = beca;
        this.promedioAcumulado = promedioAcumulado;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public float getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(float promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }

    @Override
    public String toString() {
        return "EstudiantePregrado{" +
                "beca=" + beca +
                ", promedioAcumulado=" + promedioAcumulado +
                ", listaMaterias=" + listaMaterias +
                '}';
    }
}
