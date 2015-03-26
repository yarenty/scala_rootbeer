package com.yarenty.java.rootbeer.add;

import org.trifort.rootbeer.runtime.Kernel;

public class AddKernel implements Kernel {

  private int[] array;
  private int index;

  public AddKernel(int[] array, int index){
    this.array = array;
    this.index = index;
  }

  public void gpuMethod(){
    array[index] += 1;
  }
}