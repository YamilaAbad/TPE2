package elementos;

import criterios.*;


public class Cocina {
    private Criterio condicion;
    private double valorCumple;
    private double valorNoCumple;
    private double adicional;

    //para cuando se tiene una condicion
    public Cocina(Criterio condicion, double valorCumple, double valorNoCumple) {
        this.condicion = condicion;
        this.valorCumple = valorCumple;
        this.valorNoCumple = valorNoCumple;
    }
    //para cuando solo se tiene que agregar un adicional al total
    public Cocina(double adicional) {
        this.adicional = adicional;
    }


}