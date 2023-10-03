package S07V2_39_SnayderVicente;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;

    // Constructor
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Métodos
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void saludar(String mensaje) {
        System.out.println(mensaje + ", mi nombre es " + nombre);
    }

    public void cumplirAnios() {
        edad++;
        System.out.println("Hoy cumplo " + edad + " años");
    }

    public double calcularIMC(double peso) {
        return peso / (estatura * estatura);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Métodos con parámetros y argumentos
    public void caminar(int distancia, String direccion) {
        System.out.println(nombre + " está caminando " + distancia + " metros hacia " + direccion);
    }

    public void comer(String comida, int cantidad) {
        System.out.println(nombre + " está comiendo " + cantidad + " porciones de " + comida);
    }

    // Objetos
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25, 1.75);
        Persona persona2 = new Persona("María", 30, 1.60);

        persona1.saludar();
        persona2.saludar("Buenos días");

        persona1.cumplirAnios();
        persona2.cumplirAnios();

        double imcPersona1 = persona1.calcularIMC(70);
        double imcPersona2 = persona2.calcularIMC(60);

        System.out.println(persona1.getNombre() + " tiene un IMC de " + imcPersona1);
        System.out.println(persona2.getNombre() + " tiene un IMC de " + imcPersona2);

        boolean esMayorDeEdadPersona1 = persona1.esMayorDeEdad();
        boolean esMayorDeEdadPersona2 = persona2.esMayorDeEdad();

        System.out.println(persona1.getNombre() + " es mayor de edad: " + esMayorDeEdadPersona1);
        System.out.println(persona2.getNombre() + " es mayor de edad: " + esMayorDeEdadPersona2);

        persona1.caminar(500, "el norte");
        persona2.comer("pizza", 3);
    }

    // Getters y setters
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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
}
