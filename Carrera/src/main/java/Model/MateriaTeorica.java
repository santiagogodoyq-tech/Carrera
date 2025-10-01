package Model;

public class MateriaTeorica extends Materia{

    public MateriaTeorica(String codigo, String nombre, int horaSemana, int cantidadCreditos, int semestreEsperado, Profesor profesor) {
        super (codigo, nombre, horaSemana, cantidadCreditos, semestreEsperado, profesor);
    }

    @Override
    public String toString() {
        return "MateriaTeorica{" +
                "listaEstudiantes=" + listaEstudiantes +
                ", profesor=" + profesor +
                ", semestreEsperado='" + semestreEsperado + '\'' +
                ", cantidadCreditos=" + cantidadCreditos +
                ", horaSemana=" + horaSemana +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
