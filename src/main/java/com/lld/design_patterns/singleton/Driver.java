package com.lld.design_patterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    executorService.execute(() -> TvSet.getTvSetInstance());
    executorService.execute(() -> TvSet.getTvSetInstance());

  }
}
