package elementos;

public abstract class ElementoComida {
    private String nombre;

    //constructor
    public ElementoComida(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getCalorias();
    public abstract int getTiempoPreparacion();
    public abstract double getPrecio();

}
