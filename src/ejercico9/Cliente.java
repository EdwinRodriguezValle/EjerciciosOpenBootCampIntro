package ejercico9;

public class Cliente extends Persona{
    //Variable
    private double credito;

    //Constructores
    public Cliente(){
        System.out.println("Soy el constructor de cliente.");
    }

    public Cliente(int edad, String nombre, int telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    //Setters

    public void setCredito(double credito) {
        this.credito = credito;
    }

    //Getters


    public double getCredito() {
        return credito;
    }
}
