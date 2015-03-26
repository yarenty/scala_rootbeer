# scala_rootbeer
Test usage of rootbeer inside scala project

# Install
* to /lib directory add rootbeer - easiest is to just get release from : https://github.com/pcpratts/rootbeer1/releases
* sbt eclipse
* sbt package
* build:
/usr/lib/jvm/java-7-openjdk-amd64/bin/java / 
	-Xmx8g -jar lib/Rootbeer-1.2.4.jar target/scala-2.11/scala_rootbeer_2.11-1.0.0.jar rb-GPU.jar / 
	-norecursion -nodoubles -computecapability sm_30 --generate-code arch=compute_30,code="sm_30" /
	-64bit

* run:
/usr/lib/jvm/java-7-openjdk-amd64/bin/java -Xmx8g -jar rb-GPU.jar 

* have fun ;-)


# Status


