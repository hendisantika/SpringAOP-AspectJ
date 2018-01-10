package com.hendisantika.springaop.service;

import com.hendisantika.springaop.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringAOP-AspectJ
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/18
 * Time: 22.09
 * To change this template use File | Settings | File Templates.
 */

@Component
public class CustomerAnotherService {

    private static Map<Long, Customer> store = new HashMap<Long, Customer>();

    static {
        store.put(1L, new Customer(1, "Uzumaki", "Naruto"));
        store.put(2L, new Customer(2, "Uchiha", "Sasuke"));
        store.put(3L, new Customer(3, "Uchiha", "Madara"));
        store.put(4L, new Customer(4, "Uchiha", "Itachi"));
        store.put(5L, new Customer(5, "Uchiha", "Sishui"));
    }

    public Customer getCustomerById(long id) {
        return store.get(id);
    }

    public Customer setCustomerFirstName(String firstName, long id) {
        Customer cust = store.get(id);
        cust.setFirstName(firstName);
        return cust;
    }

    public Customer setCustomerLastName(String lastName, long id) {
        Customer cust = store.get(id);
        cust.setLastName(lastName);
        return cust;
    }

    public List<Customer> findCustomerByLastName(String lastName) {
        List<Customer> listCust = new ArrayList<>();

        for (Long id : store.keySet()) {
            if (store.get(id).getLastName().equals(lastName)) {
                listCust.add(store.get(id));
            }
        }

        return listCust;
    }

    public List<Customer> findAllCustomers() {
        List<Customer> listCust = new ArrayList<>();

        for (Long id : store.keySet()) {
            listCust.add(store.get(id));
        }

        return listCust;
    }
}
