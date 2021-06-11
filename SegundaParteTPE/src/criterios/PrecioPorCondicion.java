package criterios;

import elementos.ElementoComida;

public class PrecioPorCondicion implements PorcentajeAplicado{
    private Criterio condicion;
    private double valorCumple;
    private double valorNoCumple;

    public PrecioPorCondicion(Criterio condicion, double valorCumple, double valorNoCumple) {
        this.condicion = condicion;
        this.valorCumple = valorCumple;
        this.valorNoCumple = valorNoCumple;
    }

    @Override
    public double aplicar(ElementoComida c) {
        if(condicion.cumple(c)){
            return (c.getPrecio()+valorCumple);
        }else
            return (c.getPrecio()+valorNoCumple) ;
    }
}
