package criterios;

import elementos.ElementoComida;

public class PrecioPorAdicional implements PorcentajeAplicado{
    private double porcentajeAplicado;

    public PrecioPorAdicional(double porcentajeAplicado) {
        this.porcentajeAplicado = porcentajeAplicado;
    }

    @Override
    public double aplicar(ElementoComida c) {
        return (c.getPrecio()+(porcentajeAplicado*c.getPrecio()/100));
    }
}
