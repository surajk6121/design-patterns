package com.lld.design_patterns.dsa;

import java.util.Deque;
import java.util.LinkedList;

public class MonotonicQueue {
  Deque<Integer> increasingDeque = new LinkedList<>();
  Deque<Integer> decreasingDeque = new LinkedList<>();

  public void add(int n) {
    while (!increasingDeque.isEmpty() && increasingDeque.peek() > n) {
      increasingDeque.pollLast();
    }
    increasingDeque.add(n);
    while(!decreasingDeque.isEmpty() && decreasingDeque.peek() < n) {
      decreasingDeque.pollLast();
    }
    decreasingDeque.add(n);
  }

  public void remove(int n) {
    if(!increasingDeque.isEmpty() && increasingDeque.peekFirst() == n) {
      increasingDeque.pollFirst();
    }
    if(!decreasingDeque.isEmpty() && decreasingDeque.peekFirst() == n) {
      decreasingDeque.pollFirst();
    }
  }

  public Integer getMin() {
    return increasingDeque.peekFirst();
  }

  public Integer getMax() {
    return decreasingDeque.peekFirst();
  }

}
