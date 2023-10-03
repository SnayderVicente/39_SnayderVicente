package S03_39SnayderVicente;

public class Persona1 {
    private final String nombre;
    private int edad;

    public Persona1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(String mensaje) {
        System.out.println(mensaje + ", soy " + nombre);
    }

    public void cumplirAnios() {
        edad++;
        System.out.println("Hoy cumplo " + edad + " años");
    }
}
