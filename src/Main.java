public class Main {
    public static void main(String[] args) {

        //EJERCICIO NUMERO 8
        //Crear un objeto persona en el main.
        Persona persona = new Persona();
        persona.setNombre("Edwin");
        persona.setEdad(45);
        persona.setTelefono(0031.638497646);
        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
        System.out.println("Persona numero 1");
        System.out.println("Esta persona se llama " + persona.getNombre() +
                "\n\t Tiene "  + persona.getEdad() + " años de edad. " +
                "\n\t Y, su número de teléfono es: " + persona.getTelefono());

        System.out.println();

        Persona persona1 = new Persona();
        persona1.setNombre("Carlos");
        persona1.setEdad(20);
        persona1.setTelefono(0032.6384);

        System.out.println("Persona dos:");
        System.out.println("Esta persona se llama " + persona1.getNombre() +
                "\n\t Tiene "  + persona1.getEdad() + " años de edad. " +
                "\n\t Y, su número de teléfono es: " + persona1.getTelefono());

        System.out.println();
        Persona persona2 = new Persona();
        persona2.setNombre("Mario");
        persona2.setEdad(70);
        persona2.setTelefono(6453627.0);

        System.out.println("Persona tres:");
        System.out.println("Esta persona se llama " + persona2.getNombre() +
                "\n\t Tiene "  + persona2.getEdad() + " años de edad. " +
                "\n\t Y, su número de teléfono es: " + persona2.getTelefono());



    }

        //Ejercicio Tres =

//        int resultado = sumadorDeNumeros(2, 3,4);
//        System.out.println(resultado);
//
//        Coche miChoche = new Coche(4);
//
//        System.out.println(miChoche);

        //Ejercio 4

//        //Condicional if
//        int numero = -10;
//        if (numero > 0) {
//            System.out.println(numero + " Este número es positivo.");
//        } else {
//            System.out.println(numero + " Este numero es negativo.");
//        }
//
//        //bucle while
//        System.out.println("Bucle while");
//
//        int numeroWhile = 0;
//
//        while (numeroWhile < 3) {
//            System.out.println(numeroWhile);
//            numeroWhile++;
//        }
//
//        // bucle do while
//        System.out.println("Bucle do while");
//
//        int doWhile = 2;
//
//
//        do {
//            System.out.println(doWhile);
//            doWhile++;
//        } while (doWhile < 3);
//
//        //bucle for
//        System.out.println("bucle for");
//        int lista[] = new int[5];//declaration and instantiation
//        lista[0] = 10;//initialization
//        lista[1] = 20;
//        lista[2] = 70;
//        lista[3] = 40;
//        lista[4] = 50;
//
//        for (int i = 0; i < lista.length; i++)//length is the property of array
//            System.out.println(lista[i]);
//
//        System.out.println("Array dos");
//
//   int[] list = {1, 2, 3};
//        for (int k = 0; k < list.length; k++) {
//            System.out.println(list[k]);
//        }
//
//
//// bucle switch
//      String estacion = "Primavera" ;
//
//      switch (estacion){
//          case "Primavera":
//              System.out.println("Las flores llegan!!!");
//              break;
//          case "Verano":
//                  System.out.println("Pongase su bikini!!!");
//                  break;
//          case "Otoño":
//              System.out.println("Pongase una casaca contra lluvias y vientos!!!");
//              break;
//          case"Invierno":
//              System.out.println("Ponagse a invernar!!!");
//              break;
//          default:
//              System.out.println("Usted no esta viviendo en ninguna de las estaciones");
//      }
//
//
//    //  array
//
//        int numerosArray[] = new int[10];
//        System.out.println(numerosArray[6]);
//
//
//    }
//
//   // Ejercio 3.
//    public static int sumadorDeNumeros(int a, int b, int c){
//        return a + b +c;
//    }
}