package com.designpatterns.behavioral.command.order;

import com.designpatterns.behavioral.command.Order;
import com.designpatterns.behavioral.command.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
