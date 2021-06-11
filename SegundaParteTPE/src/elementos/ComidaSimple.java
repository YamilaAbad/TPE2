package elementos;

public class ComidaSimple extends ElementoComida{

    private double precio;
    private int tiempoDePreparacion;
    private double calorias;
    private String tipo;
    private String modoPreparacion;

    public ComidaSimple(String nombre, double precio, int tiempoDePreparacion, double calorias, String tipo, String modoPreparacion) {
        super(nombre);
        this.precio = precio;
        this.tiempoDePreparacion = tiempoDePreparacion;
        this.calorias = calorias;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModoPreparacion() {
        return modoPreparacion;
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
