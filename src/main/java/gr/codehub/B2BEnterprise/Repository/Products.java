package gr.codehub.B2BEnterprise.Repository;

import gr.codehub.B2BEnterprise.model.CorporateCustomer;
import gr.codehub.B2BEnterprise.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Products {

    private List<Product> products;

    public Products(){
        products = new ArrayList<>();
    }

    public void addProduct(Product p){
        products.add(p);
    }




}
