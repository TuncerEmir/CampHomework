package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
            return client.TCKimlikNoDogrula(Long.valueOf(customer.nationalityId),customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),customer.dateOfBirth.getYear());
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
	}

}
