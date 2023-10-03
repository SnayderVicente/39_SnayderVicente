package S03_39SnayderVicente;

public class Persona2 {
    private final String nombre;
    private final int edad;

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}