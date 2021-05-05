import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
        BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Engin","Demiroð", LocalDate.of(1985,1,6),"28861499108"));

	}

}
