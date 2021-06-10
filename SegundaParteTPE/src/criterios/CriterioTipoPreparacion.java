package criterios;

import elementos.ElementoComida;

public class CriterioTipoPreparacion implements Criterio{
    String tipo;

    public CriterioTipoPreparacion(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return c.getTipo().equals(tipo);
    }
}
