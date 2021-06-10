package elementos;

public class ComidaSimple extends ElementoComida{

    private double precio;
    private int tiempoDePreparacion;
    private double calorias;
    private String tipo;

    public ComidaSimple(String nombre, double precio, int tiempoDePreparacion, double calorias, String tipo) {
        super(nombre);
        this.precio = precio;
        this.tiempoDePreparacion = tiempoDePreparacion;
        this.calorias = calorias;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCalorias() {
        return calorias;
    }

    public int getTiempoPreparacion() {
        return tiempoDePreparacion;
    }

    public double getPrecio() {
        return precio;
    }
}
