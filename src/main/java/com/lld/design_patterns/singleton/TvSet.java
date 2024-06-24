package com.lld.design_patterns.singleton;

public class TvSet {

  private static volatile TvSet tvSet = null;
  private TvSet() {
    System.out.println("Tv set is ins");
  }

  public static TvSet getTvSetInstance() {
    if(tvSet == null) {
      synchronized (TvSet.class) {
        if (tvSet == null) {
          tvSet = new TvSet();
        }
      }
    }
    return tvSet;
  }
}
