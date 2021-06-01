package poo.u7.estrutural.bridge.figura.abstracao;

import poo.u7.estrutural.bridge.figura.implementação.Cor;

public class Figura {

    private Cor cor;

    public Cor getCor() {
        return cor;
    }
    
    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
