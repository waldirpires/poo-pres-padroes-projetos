package poo.u6.criacional.builder;

public class ClasseCliente {

    public static void main(String[] args) {

        // (5) criação do builder e do diretor.
        var builder = new CasaBuilderImpl();

        var diretor = new Diretor(builder);

        var casaSimples = diretor.construir("simples");
        System.out.println(casaSimples);
        System.out.println();

        var mansao = diretor.construir("mansao");
        System.out.println(mansao);
    }

}
