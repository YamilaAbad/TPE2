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
        return "\n"+"Nombre de comida: " + nombre +"\n"+
                " Precio: $" + getPrecio()+"\n"+
                " Tiempo de preparacion: " + getTiempoPreparacion() + " minutos"+"\n"+
                " Calorias: " + getCalorias()+"\n"+
                " Tipo de comida: " + getTipo()+"\n"+
                " Modo de preparación: " + getModoPreparacion()+"."+"\n"+
                "******************************************************";
    }

    @Override
    public boolean equals(Object o) {
        try {
            ElementoComida e = (ElementoComida) o;
            return e.getTipo().equals(this.getTipo()) &&
                    e.getModoPreparacion().equals(this.getModoPreparacion());
        } catch (Exception e) {
            return false;
        }
    }

}
