package sedex.encomenda;

import sedex.frete.Padrao;
import sedex.frete.Sedex;

public enum TipoFrete {

    Padrão {
        @Override
        public Frete obterFrete() {
            return new Padrao();
        }
    },
    SEDEX {
        @Override
        public Frete obterFrete() {
            return new Sedex();
        }
    };

    public abstract Frete obterFrete();

}