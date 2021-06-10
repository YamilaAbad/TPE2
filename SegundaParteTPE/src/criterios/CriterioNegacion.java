package criterios;

import elementos.ElementoComida;

public class CriterioNegacion extends Criterio{

    Criterio criterio;

    public CriterioNegacion(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return !(criterio.cumple(c));
    }
}

