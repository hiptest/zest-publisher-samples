Java
====

First, you must use [``maven``](http://maven.apache.org/) to build the project and run the tests:

    mvn package

The SUT implementation can be seen in [``src/main/java/com/testng/coffeemachine/CoffeeMachine.java``](https://github.com/hiptest/hiptest-publisher-samples/blob/master/java/src/main/java/com/coffeemachine/CoffeeMachine.java)

JUnit
-----


To update the tests:

    hiptest-publisher -c testng.config --tests-only

The tests are generated in [``src/test/java/com/coffeemachine/testng/ProjectTest.java``](https://github.com/hiptest/hiptest-publisher-samples/blob/master/java/src/test/java/com/coffeemachine/ProjectTest.java)
