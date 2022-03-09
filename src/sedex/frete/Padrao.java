package sedex.frete;

import sedex.encomenda.Frete;

public class Padrao implements Frete {

    public double calcularPreco(int distancia) {
        return distancia * 1.18 + 11;
    }

}