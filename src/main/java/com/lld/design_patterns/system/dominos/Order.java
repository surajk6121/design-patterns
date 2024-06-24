package com.lld.design_patterns.system.dominos;


import java.util.HashMap;

public class Order {

  String id;
  HashMap<Item, Integer> itemAndQuantity;
  String OrderStatus;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HashMap<Item, Integer> getItemAndQuantity() {
    return itemAndQuantity;
  }

  public void setItemAndQuantity(HashMap<Item, Integer> itemAndQuantity) {
    this.itemAndQuantity = itemAndQuantity;
  }

  public String getOrderStatus() {
    return OrderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    OrderStatus = orderStatus;
  }

  public Order() {

  }

  public double totalCost() {
    double cost = 0D;
    for (Item item: itemAndQuantity.keySet()) {
      cost += item.getCost() * itemAndQuantity.get(item);
    }
    return cost;
  }

  public double totaltax() {
    return totalCost() * 0.18;
  }

}
