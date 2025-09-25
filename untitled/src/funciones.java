import java.util.Scanner;

public class funciones {
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
    public static String ingresarTexto(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = sc.nextLine();
        return texto;
    }
}
