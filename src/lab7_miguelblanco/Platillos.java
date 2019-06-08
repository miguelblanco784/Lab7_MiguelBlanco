package lab7_miguelblanco;

import java.awt.Color;
import java.util.Date;

public class Platillos {

    private int id;
    private Color color;
    private String nombre;
    private Date fecha = new Date();
    private int tiempo;

    public Platillos() {
    }

    public Platillos(int id) {
        switch (id) {
            case 1:
                this.nombre = "Tortilla";
                this.tiempo = 9;
                this.color = Color.RED;
                break;
            case 2:
                this.nombre = "Res";
                this.tiempo = 12;
                this.color = Color.BLACK;
                break;
            case 3:
                this.nombre = "Pollo";
                this.tiempo = 10;
                this.color = Color.yellow;
                break;
            case 4:
                this.nombre = "Capirotado";
                this.tiempo = 7;
                this.color = Color.white;
                break;
            case 5:
                this.nombre = "Pollo";
                this.tiempo = 15;
                this.color = Color.black;
                break;
            case 6:
                this.nombre = "Espaguetis";
                this.tiempo = 13;
                this.color = Color.RED;
                break;
            case 7:
                this.nombre = "Hamburguesa";
                this.tiempo = 11;
                this.color = Color.yellow;
                break;
            case 8:
                this.nombre = "Salmon";
                this.tiempo = 18;
                this.color = Color.pink;
                break;
            case 9:
                this.nombre = "Cordero";
                this.tiempo = 16;
                this.color = Color.white;
                break;
            case 10:
                this.nombre = "Pie de Limon";
                this.tiempo = 7;
                this.color = Color.GREEN;
                break;
            case 11:
                this.nombre = "Cheesecake";
                this.tiempo = 8;
                this.color = Color.RED;
                break;
            case 12:
                this.nombre = "Tiramisu";
                this.tiempo = 9;
                this.color = Color.black;
                break;
            case 13:
                this.nombre = "Crepa";
                this.tiempo = 6;
                this.color = Color.yellow;
                break;
            case 14:
                this.nombre = "Anafre";
                this.tiempo = 5;
                this.color = Color.BLACK;
                break;
            case 15:
                this.nombre = "Empanada";
                this.tiempo = 7;
                this.color = Color.red;
                break;
            case 16:
                this.nombre = "Huevos Rellenos";
                this.tiempo = 3;
                this.color = Color.white;
                break;
            default:
                throw new AssertionError();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Platillos{" + "id=" + id + ", color=" + color + ", fecha=" + fecha + '}';
    }

}
