package org.example.warehouse;

import java.util.List;


public abstract class Worker {

    public void takeAndBrakeTheProducts(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            if (i % 2 != 0) {
                products.get(i).isBroken = true;
            }
        }
    }
}

