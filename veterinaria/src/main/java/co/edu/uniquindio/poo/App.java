package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Mascota perro = new Mascota("20974","Bambino",12,"bull terrier",30,"cegera, perdida de olfato");
        Mascota gato = new Mascota("10375","tomas",4,"siames enrazado",5,"ninguna");
        Mascota perro1 = new Mascota("20464","muñeca",10,"pit bull",27,"cancer");
        Mascota conejo = new Mascota("40974"," peluche",2,"conejo arlequin",7,"ninguna");
        Mascota perro2 = new Mascota("20298","fato",16,"husky",20,"cegera, cancer, daño renal, larvas de moscas en la piel");
        Veterinaria ap = new Veterinaria("Animales peludos");
        System.out.println(ap);
        ap.agregarMascota(perro);
        ap.agregarMascota(perro1);
        ap.agregarMascota(perro2);
        ap.agregarMascota(gato);
        ap.agregarMascota(conejo);
        System.out.println(ap);
        ap.agregarMascota(perro);
        ap.agregarMascota(perro2);
        ap.eliminarMascota(gato);
        ap.eliminarMascota(perro2);
        System.out.println(ap);
    }
}
