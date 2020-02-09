package gr.codehub.B2BEnterprise.Service;

import gr.codehub.B2BEnterprise.Repository.Customers;
import gr.codehub.B2BEnterprise.Repository.Products;
import gr.codehub.B2BEnterprise.model.CorporateCustomer;
import gr.codehub.B2BEnterprise.model.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EnterpriseServices implements IEnterpriseService {

    public Products getProduct(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        Products products = new Products();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(",");
            Product p = new Product(Integer.parseInt(words[0].trim()), words[1].trim(), Double.parseDouble(words[2].trim()),
                    Integer.parseInt(words[3].trim()));
            products.addProduct(p);
        }
        return products;
    }
    public Customers getCustomer(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        Customers customers = new Customers();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(",");
            CorporateCustomer c = new CorporateCustomer(Integer.parseInt(words[0].trim()),
                    words[1].trim(), words[2].trim(), words[3].trim());
            customers.addCorporateCustomers(c);
        }
        return customers;
    }

    @Override
    public CorporateCustomer getCustomersByCode(int id){
        Customers customers = new Customers();
        return customers
                .getCustomers()
                .stream()
                .filter(cc -> cc.getCode() == id)
                .findFirst()
                .get();

        //.filter(x1 -> x2 )
    }



    @Override
    public Product getProductByCode(int id){
        Products products = new Products();
        return   products
                .getProducts()
                .stream()
                .filter(product1 -> product1.getCode()== id)
                .findFirst()
                .get();


    }
}
