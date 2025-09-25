
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        int estudiante = IngresarNumeropositivo("ingrese la cantidad de estudiantes");
        String[][] Estudiante = new String[estudiante][6];
        for (int i = 0; i < estudiante; i++) {
            int count = 0;
            Estudiante[i][count] = "nombre/s: "+ingresarTexto("ingrese el/los nombre/s del estudiante");
            count += 1;
            Estudiante[i][count] = "apellidos: "+ingresarTexto("ingrese los apellido del estudiante");
            count += 1;
            Estudiante[i][count] = "identificación: "+ingresarTexto("ingrese el numero de identificación del estudiante");
            count += 1;
            Estudiante[i][count] = "correo: "+ingresarTexto("ingrese el correo del estudiante");
            count += 1;
            Estudiante[i][count] = "telefono: "+ingresarTexto("ingrese el telefono del estudiante");
            count += 1;
            Estudiante[i][count] = "edad: "+ingresarTexto("ingrese la edad del estudiante");
            count += 1;
        }
        for (int i = 0; i < estudiante; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(Estudiante[i][j]+"; ");
            }
            System.out.println("");
        }
    }
    public static int IngresarNumeropositivo(String mensaje){
        boolean bandera = true;
        int numero = ingresarNumero(mensaje);
        while (bandera) {
            if (numero < 0) {
                System.out.println("El numero no puede ser negativo");
            } else {
                bandera = false;
            }
        }
        return numero;
    }
    public static int ingresarNumero(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int numero = sc.nextInt();
        return numero;
    }
        public static String ingresarTexto(String mensaje){
            Scanner sc = new Scanner(System.in);
            System.out.print(mensaje);
            String texto = sc.nextLine();
            return texto;
        }
}