package gr.codehub.B2BEnterprise.controller;

import gr.codehub.B2BEnterprise.Repository.Customers;
import gr.codehub.B2BEnterprise.Repository.Products;
import gr.codehub.B2BEnterprise.Service.EnterpriseServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class EnterpriseController {

    @GetMapping("customers")
    public Customers getCostumers() throws FileNotFoundException {
        EnterpriseServices es = new EnterpriseServices();
        return es.getCustomer("customers.csv");
    }

    @GetMapping("products")
    public Products getProduct() throws FileNotFoundException {
        EnterpriseServices ps = new EnterpriseServices();
        return ps.getProduct("products.csv");
    }

    @GetMapping("product/{id}")
    public Products getProductController(@PathVariable int id){
        EnterpriseServices sc = new EnterpriseServices();
        return sc.getProductByCode(id);
    }

}
