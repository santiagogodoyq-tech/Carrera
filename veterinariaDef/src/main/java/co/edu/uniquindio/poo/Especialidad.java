package co.edu.uniquindio.poo;

public class Especialidad {
    private String mi = "Medicina Interna";
    private String cirugia = "cirugia";
    private String dermatologia = "dermatologia";
    public Especialidad(String mi, String cirugia, String dermatologia) {
        this.mi = mi;
        this.cirugia = cirugia;
        this.dermatologia = dermatologia;
    }
    public String especialidad(int n){
        String especialidad = " ";
        if (n == 1){
            especialidad = mi;
        }else if (n == 2){
            especialidad = cirugia;
        }else if (n == 3){
            especialidad = dermatologia;
        }else{
            especialidad = "especialidad no encontrada";
        }
        return especialidad;
    }
}
