//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        thia.Notas

                - = new Notas[5];
    String estudiante =("nombre: "+Nombre+" "+"apellidos: "+Apellido+" "+"correo: "+Correo+" "+"telefono: "+Telefono+" "+"edad: "+Edad+" "+"Id: "+NumeroIdentificacion+"/n");
    String estud = "";
    estud += estudiante;
    System.out.println(estud);
    }
    public String getNombre(String Nombre){
        return Nombre;
    }
    public String getApellido(String Apellido){
        return Apellido;
    }
    public String getCorreo(String Correo){
        return Correo;
    }
    public String getTelefono(String Telefono){
        return Telefono;
    }
    public int getEdad(int Edad){
        return Edad;
    }
    public String getNumeroIdentificacion(String NumeroIdentificacion){
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