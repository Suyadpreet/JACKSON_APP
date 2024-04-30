package in.suyad.binding;

import lombok.Data;

@Data
public class Customer 
{
	private Integer Id;
	private String name;
	private String email;
	private Long phno;
	private AddressClass addr;
}
