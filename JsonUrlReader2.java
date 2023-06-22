/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.beam.examples.Aire;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Gado
 */
public class JsonUrlReader2 {

    public JsonUrlReader2()
    {
        
    }
    
    public static void main(String[] args) throws DatabindException, MalformedURLException, IOException {
        JsonUrlReader2 j = new JsonUrlReader2();
        ArrayList<Aire> aAire = j.cargarURL();
        
        for (Aire aire : aAire) {
            System.out.println(aire);
        }
    
        
    }
      
    public ArrayList<Aire> cargarURL() throws StreamReadException, DatabindException, MalformedURLException, IOException {
            String url = "https://mindicador.cl/api/dolar";
        
        ArrayList<Aire> aAire = new ArrayList();

        //JsonNode node = new JsonUrlReader().get(url);
        //System.out.println(node.toPrettyString());
        
        
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(new URL(url));
        
        
        Aire a = null;

        int i = 1;
        a = new Aire();
       
        
JsonNode serieNode = node.get("serie");
Iterator<JsonNode> serieIterator = serieNode.elements();

while (serieIterator.hasNext()) {
    JsonNode childNode = serieIterator.next();
    //repite 
    
    
     a.setId(String.valueOf(i));
        a.setVersion(node.get("version").asText());
        a.setAutor(node.get("autor").asText());
        a.setCodigo(node.get("codigo").asText());
        a.setNombre(node.get("nombre").asText());
        a.setUnidad_medida(node.get("unidad_medida").asText());
        
        
    // Asignar directamente los valores a las propiedades del objeto Aire
    a.setFecha(childNode.get("fecha").asText());
    a.setValor(childNode.get("valor").asText());
    
    // Agregar el objeto Aire a la lista, objeto, o realizar cualquier otra acción deseada
    aAire.add(a);
    
    // Crear un nuevo objeto Aire para la siguiente iteración
    a = new Aire();
       i++;
}

        return aAire;
    }



}//JsonUrlReader
