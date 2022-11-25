package org.example.warehouse;

import org.example.config.WarehouseConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WarehouseConfig.class);
        Absolut absolut = context.getBean(Absolut.class);
        Aist aist = context.getBean(Aist.class);
        absolut.supplyProduct();
        aist.supplyProduct();
        Warehouse warehouse = context.getBean(Warehouse.class);
        System.out.println("Товары на складе " + warehouse.getStorage());

        Petrovich petrovich = context.getBean(Petrovich.class);
        petrovich.takeProduct();
        System.out.println("Товары которые взял Петрович " + petrovich.getProducts());

        Reshar reshar = context.getBean(Reshar.class);
        reshar.takeProduct();
        System.out.println("Товары которые взял Решар " + reshar.getProducts());

        System.out.println("Остатки товаров на складе " + warehouse.getStorage());

    }
}
