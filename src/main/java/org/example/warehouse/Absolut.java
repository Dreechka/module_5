package org.example.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Absolut {
    private Warehouse warehouse;

    @Autowired
    public Absolut(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void supplyProduct() {
        List<Product> vodkaList = Stream.generate(Vodka::new).limit(3).collect(Collectors.toList());
        warehouse.getWorker2().takeAndBrakeTheProducts(vodkaList);
        warehouse.addProduct("vodka", vodkaList);
    }

}
