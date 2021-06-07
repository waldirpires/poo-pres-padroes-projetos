package poo.u7.estrutural.facade;

import java.io.File;

public class Aplicacao {

	public static void main(String[] args) {
		var conversor = new ConversorDeVideo();
		
		// antes
//		System.out.println("Convertendo o arquivo " + nomeArquivo + " para o formato " + formato + "\n\n");
//		
//		// abrindo arquivo de entrada
//		var arquivo = new ArquivoDeVideo(nomeArquivo);
//		
//		// obtendo o codec de entrada
//		var codec = new FabricaDeCodificadores().extrair(arquivo);
//		
//		// obtendo o codec de destino
//		CodecDeCompressao codecDestino = null;
//		if (formato.equals("mp4")) {
//			codecDestino = new CodificadorDeCompressaoMpeg4();
//		} else {
//			codecDestino = new CodificadorDeCompressaoOgg();
//		}
//		
//		// lendo os dados usando codec de origem
//		var buffer = new LeitorDeTaxaDeBits().ler(arquivo, codec);
//		
//		// escrevendo os dados uasndo codec de destino
//		var resultado = new LeitorDeTaxaDeBits().converter(buffer, codecDestino);
//		
//		// codificando o audio a partir do resultado
//		resultado = new MixadorDeAudio().codificarAudio(resultado);
//		
//		// retornando o resultado finalizado
//		return new File(resultado);		
		
		// (3)  fachada simplificada
		var ogg = conversor.converter("teste.mp4", "ogg");
		
		System.out.println(ogg);
	}
}
