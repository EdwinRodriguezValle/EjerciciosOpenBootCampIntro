package ejercico9;

public class Trabajador extends Persona{
    private double salario;

    //Constructor
    public Trabajador(){
        System.out.println("Soy el constructor de trabajador.");
    }

    public Trabajador(int edad, String nombre, int telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    //Gettes

    public double getSalario() {
        return salario;
    }

    // setter

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
