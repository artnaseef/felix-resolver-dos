# Felix Resolver DOS Project

This project provides a simple way to reproduce a DOS (Denial-Of-Service)
in the Felix Resolver for troubleshooting purposes.

Working with Karaf version 4.3.2.


# To Use

* Run the container (NOTE: this will consume a significant amount of CPU time)

    $ mvn clean install


* Attach a Debugger on port 5005

	The following line is of interest

		org/apache/felix/resolver/ResolverImpl.java:563

	That's in findValidCandidates() just inside the do loop.


# Symptoms

* High CPU Usage
* OutOfMemory reported by the JVM
* findValidCandidates() method infinite loop
* Lack of logging explaining the problem
* Feature Install operation never finishes
  * feature:install from the shell never returns control to the user
* Heap space usage growth easily viewed with VisualVM's Heap monitor


# NOTES TO REPRODUCE

* Adding pax-logging-api version 1.11.13 to startup.properties
* Adding pax-logging-log4j2 version 1.11.13 to startup.properties
* Load the following features:
  * spring
  * cxf-core
* OR, load the following trimmed-down features (from this project's feature file):
  * test-cxf-specs
  * test-cxf-core-part002
  * test-cxf-core-part005
  * test-spring-part001
  * test-spring-part002
  * test-spring-part003
  * test-spring-part004
  * test-spring-part005
  * test-spring-part006
