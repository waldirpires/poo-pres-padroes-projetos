package poo.u7.estrutural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class AdapterXmlToJsonImpl implements AdapterXmlToJson {

    private Servico servico;

    public AdapterXmlToJsonImpl(Servico servico) {
        this.servico = servico;
    }

    @Override
    public String adaptarDados(String xml) throws JsonMappingException, JsonProcessingException {
        // dados originais em XML
        System.out.println("Dados originais:\n");
        System.out.println(xml);
        System.out.println();

        // ler os dados em XML, mapear em classe/objeto Java
        XmlMapper xmlMapper = new XmlMapper();
        Stock stock = xmlMapper.readValue(xml, Stock.class);

        // objeto Java
        System.out.println("Objeto: " + stock);

        // mapear objeto Java em JSON
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(stock);

        System.out.println("JSON: " + json);

        servico.analisarDadosEmJson(json);

        return json;
    }

}
