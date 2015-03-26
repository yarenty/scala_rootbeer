package com.yarenty.java.rootbeer.add;

import java.util.List;
import java.util.ArrayList;
import org.trifort.rootbeer.runtime.Kernel;
import org.trifort.rootbeer.runtime.Rootbeer;
import org.trifort.rootbeer.runtime.util.Stopwatch;

public class SimpleAdd {

  public void multArray(int[] array){
    List<Kernel> tasks = new ArrayList<Kernel>();
    for(int index = 0; index < array.length; ++index){
      tasks.add(new AddKernel(array, index));
    }

    Rootbeer rootbeer = new Rootbeer();
    rootbeer.run(tasks);
  }

  private void printArray(String message, int[] array){
    for(int i = 0; i < array.length; ++i){
      System.out.println(message+" array["+i+"]: "+array[i]);
    }
  }

  public static void main(String[] args){
    SimpleAdd app = new SimpleAdd();
    int length = 10;
    int[] array = new int[length];
    for(int index = 0; index < array.length; ++index){
      array[index] = index;
    }

    app.printArray("start", array);
    app.multArray(array);
    app.printArray("end", array);
  }
}