package lk.ijse.pos.db;

import lk.ijse.pos.model.Customer;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<Customer> customerList= new ArrayList();

    static {
        customerList.add(new Customer("C--001","Nimal","Colombo 11",250000));
        customerList.add(new Customer("C--002","kamal","Colombo 10",100000));
    }
}
