package sedex.frete;

import sedex.encomenda.Frete;

public class Sedex implements Frete {

    public double calcularPreco(int distancia) {
        return distancia * 1.33 + 15;
    }

}