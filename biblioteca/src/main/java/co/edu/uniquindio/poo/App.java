package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Libro don = new Libro("don quijote de la mancha","Miguel de Cervantes",1605,true);
        Biblioteca uq = new Biblioteca("uq");
        uq.registrarLibro(don);
        System.out.println("mostrar catalago"+uq);
    }
}
