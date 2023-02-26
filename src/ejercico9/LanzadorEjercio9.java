package ejercico9;

public class LanzadorEjercio9 {

    public static void main(String[] args) {

//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        //Primero hago la manera de asignar valores con setters e imprimirlos con getters
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setTelefono(6389987);
        cliente.setNombre("Bonifacio Condori");
        cliente.setCredito(23456.4);

        System.out.println("\n Cliente edad,teléfono, y nombre de la clase padre :\n \t Nombre: " + cliente.getNombre() + ". \n\t Tiene " +  cliente.getEdad() + "anos" + "\n\t Telefono: " + cliente.getTelefono() + ".\n\t Tiene  un credito de: " + cliente.getCredito());

        System.out.println("\n AQUi LE DOY LOS DATOS CON LA AYUDA DEL CONSTRUCTOR");
        Trabajador trabajador = new Trabajador(40, "marcelino", 23456, 5647);
        System.out.println("Yo soy el trabajador construido con la ayuda del los constructores: " + trabajador);







    }

}
