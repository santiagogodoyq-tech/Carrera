package co.edu.uniquindio.poo;

public class Pajaro extends Animal {
    private String grosorPlumas;
    private String sonido = "gorgoteo";
    public Pajaro(String nombre, String tipo,String raza , String codigo, String grosorPlumas) {
        super();
        this.grosorPlumas = grosorPlumas;
    }
    public String getGrosorPlumas() {
        return grosorPlumas;
    }
    public void setGrosorPlumas(String grosorPlumas) {
        this.grosorPlumas = grosorPlumas;
    }
    public String toString() {
        String respuesta = "Animal: "+tipo+" \n raza: "+raza+"\n codigo:"+codigo+"\n nombre:"+nombre+"\n grosor de la pluma:"+grosorPlumas+"\n sonido"+sonido+"\n";
        return respuesta;
    }
}
