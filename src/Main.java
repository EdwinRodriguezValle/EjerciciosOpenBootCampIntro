public class Main {
    public static void main(String[] args) {

        int resultado = sumadorDeNumeros(2, 3,4);
        System.out.println(resultado);

        Coche miChoche = new Coche(4);

        System.out.println(miChoche);


    }

    public static int sumadorDeNumeros(int a, int b, int c){
        return a + b +c;
    }
}