package poo.u7.estrutural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface AdapterXmlToJson {

    String adaptarDados(String xml) throws JsonMappingException, JsonProcessingException;
}
