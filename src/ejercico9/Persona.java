package ejercico9;

public class Persona {
    //Variables
    private int edad;
    private String  nombre;
    private int telefono;

    //Constructor
    public Persona(){
        System.out.println("Soy el constructor de Persona");
    }

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //Getters

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}
