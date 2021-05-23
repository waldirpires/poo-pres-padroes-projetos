package poo.u6.criacional.builder;

public class Diretor {

    private KitLuxo builder;

    public Diretor(KitLuxo builder) {
        this.builder = builder;
    }

    // (4) criar diferentes tipos de objetos complexos
    public Casa construir(String tipo) {
        if (tipo.equals("simples")) {
            builder.comQuartos(2);
            builder.comJanelas(4);
            builder.comPortas(2);
            builder.comGaragem(false);
            builder.comJardim(false);
            builder.comPiscina(false);
            builder.comPortao(true);

            builder.comHidromassagem(false);
        } else if (tipo.equals("mansao")) {
            builder.comQuartos(10);
            builder.comJanelas(20);
            builder.comPortas(6);
            builder.comGaragem(true);
            builder.comJardim(true);
            builder.comPiscina(true);
            builder.comPortao(true);

            builder.comHidromassagem(true);
        }

        return builder.build();
    }
}
