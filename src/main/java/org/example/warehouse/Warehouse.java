package org.example.warehouse;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Getter
@Component
public class Warehouse {
    private Worker worker1;
    private Worker worker2;
    private HashMap<String, List<Product>> storage;

    @Autowired
    public Warehouse(Worker worker1, Worker worker2) {
        this.worker1 = worker1;
        this.worker2 = worker2;
        storage = new HashMap<String, List<Product>>();
    }

    public void addProduct(String name, List<Product> products) {
        storage.put(name, products);
    }


}
