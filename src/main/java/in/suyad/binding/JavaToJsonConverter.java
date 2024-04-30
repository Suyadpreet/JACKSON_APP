package in.suyad.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter
{

	public static void main(String[] args) 
	{
		AddressClass adr = new AddressClass();
		adr.setCity("Sanghol");
		adr.setState("Punjab");
		adr.setCountry("India");
		Customer c = new Customer();
		c.setId(15);
		c.setName("Suyadpreet");
		c.setEmail("Suyadpreet@gmail.com");
		c.setPhno(95015L);
		c.setAddr(adr);
		
		ObjectMapper mapper = new ObjectMapper();
		try 
		{
			mapper.writeValue(new File("customer.json"), c);
			System.out.println("JSNO File Created");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
