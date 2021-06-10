package criterios;

import elementos.ElementoComida;

public class CriterioPorCalorias implements Criterio{
    double calorias;

    public CriterioPorCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return c.getCalorias()<calorias;
    }
}
