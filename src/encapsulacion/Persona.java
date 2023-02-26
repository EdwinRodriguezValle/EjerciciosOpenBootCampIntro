package encapsulacion;

//Crear variables las privadas edad, nombre y telefono de la clase encapsulacion.Persona.
public class Persona {
     private int edad;
     private String nombre;
     private double telefono;



     //Crear gets y sets de cada propiedad.

    //Setters

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }


    // Getters


    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTelefono() {
        return telefono;
    }
}
