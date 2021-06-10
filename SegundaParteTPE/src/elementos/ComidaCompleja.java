package elementos;

import java.util.ArrayList;

public class ComidaCompleja extends ElementoComida{

    ArrayList<ElementoComida> comidas;

    public ComidaCompleja(String nombre) {
        super(nombre);
        comidas= new ArrayList<ElementoComida>();
    }

    public void addComida(ElementoComida comida){
        if(!comidas.contains(comida)){
            comidas.add(comida);
        }
    }

    public double getCalorias() {
        double totalCalorias=0;
        for (ElementoComida comida : comidas) {
            totalCalorias = totalCalorias + comida.getCalorias();
        }
        return totalCalorias;
    }


    public int getTiempoPreparacion() {
        int tiempoTotal = 0;
        for(ElementoComida comida : comidas){
            tiempoTotal = tiempoTotal + comida.getTiempoPreparacion();
        }
        return tiempoTotal;
    }


    public double getPrecio() {
        double precioTotal = 0;
        for (ElementoComida comida : comidas){
            precioTotal = precioTotal + comida.getPrecio();
        }
        return precioTotal;
    }

    public String getTipo() {
        String tipoPreparacionPorElemento = null;
        for (ElementoComida comida : comidas){
            tipoPreparacionPorElemento = comida.getTipo();
        }
        return tipoPreparacionPorElemento;
    }

    public String getModoPreparacion() {
        String modoPreparacionPorElemento = null;
        for (ElementoComida comida : comidas){
            modoPreparacionPorElemento = comida.getModoPreparacion();
        }
        return modoPreparacionPorElemento;
    }
}
