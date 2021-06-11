package elementos;

import criterios.*;

import java.util.ArrayList;


public class Cocina {

    private ArrayList<ElementoComida> pedidos;

    //para cuando se tiene una condicion
    public Cocina(ArrayList<ElementoComida> pedido) {
        this.pedidos=new ArrayList<ElementoComida>();
        pedidos=pedido;
    }

    //deriva a cada comida en la lista del pedido a una estacion segun el criterio que se le de
    public ArrayList<ElementoComida> derivoEstaciones(Criterio criterio){
        ArrayList<ElementoComida> cocinar = new ArrayList<>();
        for(ElementoComida c:pedidos){
            if (criterio.cumple(c))
                cocinar.add(c);
        }
        return cocinar;
    }

    public double aplicoExtra(PorcentajeAplicado cocina){
        double totalAcobrar=0;
        for(ElementoComida c:pedidos){
            totalAcobrar= totalAcobrar + cocina.aplicar(c);
        }
        return totalAcobrar;
    }


}