package Abstract;

import Entities.Customer;

public interface ICustomerService {
	
	//Bu interface'i implemente eden herkes bu imzay� kullanmak zorundad�r.
	void save(Customer customer);

}
