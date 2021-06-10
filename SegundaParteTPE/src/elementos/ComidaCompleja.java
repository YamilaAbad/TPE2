package elementos;

import java.util.ArrayList;

public class ComidaCompleja extends ElementoComida{

    ArrayList<ElementoComida> comidas;

    public ComidaCompleja(String nombre, ArrayList<ElementoComida> comidas) {
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
        return 0;
    }


    public double getPrecio() {
        return 0;
    }
}
