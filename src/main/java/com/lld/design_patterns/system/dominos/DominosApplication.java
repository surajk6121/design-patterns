package com.lld.design_patterns.system.dominos;

import java.util.HashMap;

public class DominosApplication {

  public static void main(String[] args) {
    Order order  =  new Order();
    order.setId("71326412");

    HashMap<Item, Integer> itemMap = new HashMap<>();
    itemMap.put(new OnionPizza(), 2);

    CornPizza cornPizza = new CornPizza();
    ExtraCheese extraCheeseCornPizza = new ExtraCheese(cornPizza);

    itemMap.put(extraCheeseCornPizza, 3);
    order.setItemAndQuantity(itemMap);

    order.setOrderStatus("Confirmed");

    Invoice invoice = new Invoice(order);

    System.out.println("Invoice Amount: "+ invoice.totalBillAmount());

  }
}
