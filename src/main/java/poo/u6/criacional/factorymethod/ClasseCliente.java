package poo.u6.criacional.factorymethod;

public class ClasseCliente {

    public static void main(String[] args) {

        // (4) usar o metodo de fábrica para criar os produtos
        Logistica logistica = new LogisiticaAerea();
        logistica.planejarEntrega();
        System.out.println();

        logistica = new LogisticaMaritima();
        logistica.planejarEntrega();
        var transporte = logistica.criarTransporte();
        System.out.println();

        logistica = new LogisticaTerrestre();
        logistica.planejarEntrega();
        System.out.println();
    }

}
