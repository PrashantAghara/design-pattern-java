package com.designpatterns.behavioral.command.order;

import com.designpatterns.behavioral.command.Order;
import com.designpatterns.behavioral.command.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
