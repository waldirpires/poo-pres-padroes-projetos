package poo.u6.criacional.prototype;

public class MainCliente {

    public static void main(String[] args) {
        var prototipo = new Circulo(3, 4, "verde", 10);
        System.out.println(prototipo);
        System.out.println();

        // forma tradicional de clonar/copiar um objeto
        var copia2 = new Circulo(prototipo.x, prototipo.y, prototipo.cor, prototipo.raio);

        var copia = prototipo.clonar();
        System.out.println(copia);
        System.out.println();

        var protRet = new Retangulo(5, 8, "amarelo", 12, 5);
        System.out.println(protRet);
        System.out.println();

        copia = protRet.clonar();
        System.out.println(copia);
        System.out.println();

    }
}
