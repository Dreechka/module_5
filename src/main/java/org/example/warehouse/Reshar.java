package org.example.warehouse;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Getter
public class Reshar {
    private Warehouse warehouse;
    private List<Product> products;

    @Autowired
    public Reshar(Warehouse warehouse) {
        this.warehouse = warehouse;
        products = new ArrayList<Product>();
    }

    public void takeProduct() {
        products = warehouse.getStorage()
                .get("bicycle")
                .stream()
                .filter(e -> !e.isBroken)
                .collect(Collectors.toList());
        warehouse.getStorage().get("bicycle").removeAll(products);
    }
}
