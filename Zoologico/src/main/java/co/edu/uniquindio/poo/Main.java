package co.edu.uniquindio.poo;
import javax.swing.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String sonido = "chillido gorjeo ladrido agudo humkming ";
    Zoologico zoologico = new Zoologico("Zoo UQ","Armenia, Colombia");
    Animal mono = new Mono("patroclo", "mono", "orangutan", "357678","pygmaeus");
    Animal pajaro = new Pajaro("preto", "pajaro", "ruiseñor", "214342","fina");
    Animal zorro = new Zorro("endro", "zorro", "zorro rojo", "23523","rojo");
    Animal alpaca = new Alpaca("perine", "alpaca", "huacaya", "782734",0.87);
    Animal zorro1 = new Zorro("magdalena", "zorro", "zorro artico", "87234","blanco");
    zoologico.agregarAnimal(mono);
    zoologico.agregarAnimal(pajaro);
    zoologico.agregarAnimal(zorro);
    zoologico.agregarAnimal(alpaca);
    zoologico.agregarAnimal(zorro1);
    JOptionPane.showMessageDialog(null, zoologico);
    zoologico.sonido(alpaca);
    }
}