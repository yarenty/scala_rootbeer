# scala_rootbeer
Test usage of rootbeer inside scala project

# Install
* to /lib directory add rootbeer - easiest is to just get release from : https://github.com/pcpratts/rootbeer1/releases
* sbt eclipse
* sbt package
* build:
* <pre>
/Library/Java/JavaVirtualMachines/1.7.0.jdk/Contents/Home/bin/java -Xmx8g -jar lib/Rootbeer.jar \
    target/scala-2.11/scala_rootbeer_2.11-1.0.0.jar rb-GPU.jar -norecursion -nodoubles \
    -computecapability sm_30 --generate-code arch=compute_30,code="sm_30" -64bit

</pre>
* run:
<pre>
/Library/Java/JavaVirtualMachines/1.7.0.jdk/Contents/Home/bin/java -Xmx8g -cp rb-GPU.jar \  com.yarenty.java.rootbeer.add.SimpleAdd 
</pre>
* have fun ;-)


#Update core rootbeer
to get version of rootbeer supporting nvcc 7.0: (use https://github.com/yarenty/rootbeer1 )
  ant clean
  ant jar
  ./pack-rootbeer
@Note: ant is fixed to macosx Java 7 lib as rootbeer works only on java 1.7






# Status


