# Scala Setup

To get setup for class, do the following.

1. Install Java 8. JDK is best but JRE should be ok.

   [http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
   
   Make sure when you type in a shell "java -version" it shows version 8.

1. **Install git client.** Download it from 

   [https://git-scm.com/downloads](https://git-scm.com/downloads)
1. **Download this repository.** Use the following command

   ```git clone https://github.com/47deg/scala-setup.git```
1. **Install SBT.** Download it from

  [http://www.scala-sbt.org/](http://www.scala-sbt.org/)
1. **Test SBT.** In the root directory for the scala-setup (it should contain build.sbt) run sbt and then enter the following
   commands:

  ```
  run
  test
  exit
  ```
  
  Run should have printed out "Hello World". Test should have said "Passed 1".
1. **Install Intellij and its Scala plugin.** (You can instead use Eclipse, but you will be somewhat more on your own). You can download the free community edition of Intellij at

   [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
   
   Run Intellij. Under the menu Preferences/Plugins install the Jetbrains Scala plugin.
1. **Test Intellij.** Run Intellij. Select menu File/Open and select the root directory for scala-setup. On the next screen make sure all the checkboxes are checked and you have selected Java 1.8. 

You should now see a Project browse pane on the left that will let you browse through the files in scala-setup. You should take a look at the following two files:

```
   src/main/scala/com/fourtysevendeg/Hello.scala
   src/test/scala/com/fourtysevendeg/TestHello.scala
   ```


