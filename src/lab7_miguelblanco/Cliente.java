package lab7_miguelblanco;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private int edad;
    private char genero;
    private ArrayList<Platillos> platillos = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public ArrayList<Platillos> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(ArrayList<Platillos> platillos) {
        this.platillos = platillos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", platillos=" + platillos + '}';
    }

}
