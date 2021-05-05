package Abstract;

import Entities.Customer;

public interface ICustomerService {
	
	//Bu interface'i implemente eden herkes bu imzayý kullanmak zorundadýr.
	void save(Customer customer);

}
