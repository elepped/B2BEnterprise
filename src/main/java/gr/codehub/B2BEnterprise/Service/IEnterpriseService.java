package gr.codehub.B2BEnterprise.Service;

import gr.codehub.B2BEnterprise.Repository.Customers;
import gr.codehub.B2BEnterprise.Repository.Products;
import gr.codehub.B2BEnterprise.model.Product;


import java.io.IOException;

public interface IEnterpriseService {
    Customers getCustomers();
    Customers getCustomerByCode(int code);
    Products getProducts();
    Product getProductByCode(int code) throws IOException;
}