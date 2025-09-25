package co.edu.uniquindio.poo;

public class Alpaca extends Animal {
    private double altura;
    private String sonido = "humme";
    public Alpaca(String nombre,String tipo ,String raza , String codigo, double altura){
        super();
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String toString() {
        String respuesta = "Animal: "+tipo+" \n raza: "+raza+"\n codigo:"+codigo+"\n nombre:"+nombre+"\n altura:"+altura+"\n sonido"+sonido+"\n";
        return respuesta;
    }
}
