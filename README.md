# RemoteControl

Remote Control Vehicle operated by console using Java

## Requirements

- Java JDK (Tested in version: 1.8.151)

## Optionals

- Eclipse (Tested in Eclipse Java EE IDE for Web Developers. Version: Oxygen.1a Release (4.7.1a))
- Gradle (Tested in version 4.4)
- Buildship Gradle integration 2.0 for eclipse

## Execute

After install Java, Eclipse and Buildship Gradle integration 2.0 for eclipse, you can import the project as a Gradle project in eclipse. Then you can open the file src/main/java/com/leanfactory/remote/core/Aplication.java and run it as a Java application.

You can also use Gradle to create a jar file. If you are in a console window, in the folder directory, run `gradle build` and then you can run `java -jar build/libs/RemoteControl-1.0.jar` to execute the application

## Running unit tests

Run `gradle test` to execute the unit tests via JUnit.

You can also run the tests using any IDE (Eclipse, IntelliJ or NetBeans) with support to JUnit.
