package com.lld.design_patterns.system.dominos;

public class Invoice {
  String id;
  Order order;
  double billAmount;
  double tax;
  String url;

  public Invoice (Order order) {
    this.order = order;
    this.billAmount = order.totalCost();
    this.tax = order.totaltax();
  }

  public double totalBillAmount() {
    return billAmount + tax;
  }
}
