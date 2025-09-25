package co.edu.uniquindio.poo;

public class Estudiante {
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Telefono;
    private int Edad;
    private int[] Notas;
    private String NumeroIdentificacion;

    public Estudiante(String Nombre, String Apellido, String Correo, String Telefono, int Edad, String NumeroIdentificacion, int[] Notas) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.NumeroIdentificacion = NumeroIdentificacion;
        String estudiante =("nombre: "+Nombre+" "+"apellidos: "+Apellido+" "+"correo: "+Correo+" "+"telefono: "+Telefono+" "+"edad: "+Edad+" "+"Id: "+NumeroIdentificacion+"/n");
        String estud = "";
        estud += estudiante;
        System.out.println(estud);
    }
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getCorreo(){
        return Correo;
    }
    public String getTelefono(){
        return Telefono;
    }
    public int getEdad(){
        return Edad;
    }
    public String getNumeroIdentificacion(){
        return NumeroIdentificacion;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public void setNumeroIdentificacion(String NumeroIdentificacion){
        this.NumeroIdentificacion = NumeroIdentificacion;
    }
}