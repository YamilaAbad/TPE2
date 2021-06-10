package criterios;

import elementos.ElementoComida;

public class CriterioNegacion implements Criterio{

    Criterio criterio;

    public CriterioNegacion(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return !(criterio.cumple(c));
    }
}

