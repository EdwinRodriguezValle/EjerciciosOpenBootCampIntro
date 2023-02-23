public class Coche {
    public int puertas = 0;

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public int incrementadorDePuertas(int puerta){
        return puertas + puerta;
    }
}
