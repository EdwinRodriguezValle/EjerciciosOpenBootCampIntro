public class Coche {

    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public int acelarar (){
       return (int) (velocidadActual += 15);
    }

    public void frenar(){}
}
