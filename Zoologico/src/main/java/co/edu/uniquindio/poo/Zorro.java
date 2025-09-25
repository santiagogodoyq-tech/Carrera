package co.edu.uniquindio.poo;

public class Zorro extends Animal {
    private String color;
    private String sonido = "ladrido agudo";
    public Zorro( String nombre, String tipo,String raza, String codigo, String color){
        super();
        this.color = color;
    }
    public String getcolor() {
        return color;
    }
    public void setcolor(String color) {
        this.color = color;
    }
    public String toString() {
        String respuesta = "Animal: "+tipo+" \n raza: "+raza+"\n codigo:"+codigo+"\n nombre:"+nombre+"\n color:"+color+"\n sonido"+sonido+"\n";
        return respuesta;
    }
}
