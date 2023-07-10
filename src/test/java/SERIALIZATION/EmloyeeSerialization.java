package SERIALIZATION;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import JSON.pojoClass;
import pojoForSerAndDes.PojoClass;


public class EmloyeeSerialization {
	@Test
	public void empser() throws JsonGenerationException, JsonMappingException, IOException {
		
	
	ObjectMapper omp = new ObjectMapper();
	PojoClass p=new PojoClass("yashu","y89",99087656);
	omp.writeValue(new File("./emp.json"),p);
			
	
	
}
}