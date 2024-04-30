package in.suyad.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter
{
	public static void main(String[] args) 
	{
		File f = new File("customer.json");
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			Customer readValue = mapper.readValue(f, Customer.class);
			System.out.println("Id = "+readValue.getId());
			System.out.println("Name = "+readValue.getName());
			System.out.println("Email = "+readValue.getEmail());
			System.out.println("Phno = "+readValue.getPhno());
			System.out.println("City = "+readValue.getAddr().getCity());
			System.out.println("State = "+readValue.getAddr().getState());
			System.out.println("Country = "+readValue.getAddr().getCountry());
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
