package Model;
public  class MateriaPractica extends Materia {
        private int numeroHorasPractica;
        private int numeroLaboratorios;

        private MateriaPractica(String codigo, String nombre, int horaSemana, int cantidadCreditos, String semestreEsperado, Profesor profesor, int numeroHorasPractica, int numeroLaboratorios ) {
            super(codigo, nombre, horaSemana, cantidadCreditos, semestreEsperado, profesor);
            this.numeroHorasPractica = numeroHorasPractica;
            this.numeroLaboratorios = numeroLaboratorios;
        }
        public int getNumeroHorasPractica () {
            return numeroHorasPractica;
        }
        public void setNumeroHorasPractica(int numeroHorasPractica){
            this.numeroHorasPractica = numeroHorasPractica;
        }
 public int getNumeroLaboratorios(){
            return numeroLaboratorios;
 }
 public void setNumeroLaboratorios(int numeroLaboratorios){
            this.numeroLaboratorios = numeroLaboratorios;
 }

    @Override
    public String toString() {
        return "MateriaPractica{" +
                "listaEstudiantes=" + listaEstudiantes.stream()
                .map(Estudiante::getNombre)
                .toList() +
                ", profesor=" + profesor.getNombre() +
                ", semestreEsperado='" + semestreEsperado + '\'' +
                ", cantidadCreditos=" + cantidadCreditos +
                ", horaSemana=" + horaSemana +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", numeroLaboratorios=" + numeroLaboratorios +
                ", numeroHorasPractica=" + numeroHorasPractica +
                "}"+"\n";
    }
}
