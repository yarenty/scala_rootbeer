package com.yarenty.scala.rootbeer
import org.trifort.rootbeer.runtime.Kernel
/**
 * Created by yarenty on 04/06/15.
 */
class ScalarAddKernel( array: Array[Int], index: Int) //extends Kernel{
{


   def gpuMethod(){
      array(index) += 1;
    }


}
