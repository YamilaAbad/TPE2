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
    public abstract String getTipo();
    public abstract String getModoPreparacion();
    @Override
    public String toString() {
        return "Nombre de comida: " + nombre + ","+
                " Precio: $" + getPrecio() +","+
                " Tiempo de preparacion: " + getTiempoPreparacion() + " minutos" +","+
                " Calorias: " + getCalorias() +","+
                " Tipo de comida: " + getTipo() +","+
                " Modo de preparación: " + getModoPreparacion()+".";
    }
}
