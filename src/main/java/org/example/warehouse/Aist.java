package org.example.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Aist {
    private Warehouse warehouse;

    @Autowired
    public Aist(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void supplyProduct() {
        List<Product> bicycleList = Stream.generate(Bicycle::new).limit(3).collect(Collectors.toList());
        warehouse.getWorker1().takeAndBrakeTheProducts(bicycleList);
        warehouse.addProduct("bicycle", bicycleList);
    }

}
