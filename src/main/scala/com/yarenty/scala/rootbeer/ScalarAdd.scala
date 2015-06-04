package com.yarenty.scala.rootbeer

import java.util.{ArrayList, List}

import com.yarenty.java.rootbeer.add.AddKernel
import org.trifort.rootbeer.runtime.{Kernel, Rootbeer}

/**
 * Created by yarenty on 04/06/15.
 */
object ScalarAdd {


  def multArray(array: Array[Int]) {
    val tasks: List[Kernel] = new ArrayList[Kernel]

    for (id <- array) {
      tasks.add(new AddKernel(array, id))
    }

    val rootbeer: Rootbeer = new Rootbeer()

    rootbeer.run(tasks)
  }

  def printArray(message: String, array: Array[Int]) {
    for (i <- array) {
      println(message + " array[" + i + "]: " + array(i))
    }
  }

  def main(args: Array[String]) {

    val length: Int = 10
    val array = new Array[Int](length)
    for (index <- array) {
      array(index) = index
    }

    printArray("start", array)
    multArray(array)
    printArray("end", array)
  }
}
