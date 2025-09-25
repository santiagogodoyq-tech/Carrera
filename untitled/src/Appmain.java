public class Appmain {
    public static void main(String[] args) {
        String nombre = "";
        String apellido = "";
        String correo = "";
        String telefono = "";
        int edad = 0;
        String numeroIdentificacion = "";
        int estudiantes = 5;
        for (int i = 0; i < estudiantes; i++) {
            nombre = funciones.ingresarTexto("ingrese el/los nombre/s del estudiante ");
            apellido = funciones.ingresarTexto("ingrese los apellido del estudiante ");
            numeroIdentificacion = funciones.ingresarTexto("ingrese el numero de identificación del estudiante ");
            correo = funciones.ingresarTexto("ingrese el correo del estudiante ");
            telefono = funciones.ingresarTexto("ingrese el telefono del estudiante ");
            edad = funciones.ingresarNumero("ingrese la edad del estudiante ");
            Estudiante x = new Estudiante(nombre, apellido, correo, telefono, edad, numeroIdentificacion);
        }
    }
}
