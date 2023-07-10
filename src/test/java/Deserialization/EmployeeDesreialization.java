package Deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerAndDes.PojoClass;

public class EmployeeDesreialization {
	public void empDser() throws JsonGenerationException, JsonMappingException, IOException {
		
		
	ObjectMapper omp = new ObjectMapper();
	PojoClass data= omp.readValue(new File("./emp1.json"), PojoClass.class);
	System.out.println(data.getName());
	System.out.println(data.getId());
	System.out.println(data.getPhno());
	

			
	
	
}

}
