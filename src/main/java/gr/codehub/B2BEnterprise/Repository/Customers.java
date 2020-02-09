package gr.codehub.B2BEnterprise.Repository;

import gr.codehub.B2BEnterprise.model.CorporateCustomer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Customers {

    private List<CorporateCustomer> customers;
    private final String DELIMITER = ";";


    public Customers(){
        customers = new ArrayList<>();
    }

    public List<CorporateCustomer> getCustomers() {
        return customers;
    }

    public void addCorporateCustomers(CorporateCustomer cc){
        customers.add(cc);
    }

}
