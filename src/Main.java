public class Main {
    public static void main(String[] args) {

        //Ejercicio Tres =

//        int resultado = sumadorDeNumeros(2, 3,4);
//        System.out.println(resultado);
//
//        Coche miChoche = new Coche(4);
//
//        System.out.println(miChoche);

        //Ejercio 4
         int numero = -10;
         if(numero > 0){
             System.out.println( numero + " Este número es positivo.");
         } else {
             System.out.println( numero + " Este numero es negativo.");
         }

         int numeroWhile = 0;

         while (numeroWhile < 3){
             System.out.println(numeroWhile);
             numeroWhile++;
         }

        int doWhile = 3;


        do{
            System.out.println(doWhile);
            doWhile ++;
        }while (doWhile < 3);

        int numeroFor [] = {1, 2, 3};

      for (int i = 0; i <= numeroFor.length; i++) {
            System.out.println(numeroFor[i]);
      }

      String estacion = "Primavera" ;

      switch (estacion){
          case "Primavera":
              System.out.println("Las flores llegan!!!");
              break;
          case "Verano":
                  System.out.println("Pongase su bikini!!!");
                  break;
          case "Otoño":
              System.out.println("Pongase una casaca contra lluvias y vientos!!!");
              break;
          case"Invierno":
              System.out.println("Ponagse a invernar!!!");
              break;
          default:
              System.out.println("Usted no esta viviendo en ninguna de las estaciones");
      }


    }

    //Ejercio 3.
    public static int sumadorDeNumeros(int a, int b, int c){
        return a + b +c;
    }
}