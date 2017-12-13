DATOS

- Kevin Gutiérrez
- C.C. 1.022.384.872

INSTRUCCIONES DE INSTALACIÓN

-Instalar el JDK de Java (Se recomienda utilizar la versión 1.8.151).

La ejecución de la aplicación se puede realizar a través de un IDE o a través de Gradle:

1. Gradle
- Instalar Gradle (Se recomienda utilizar la versión 4.4)
- Ejecutar el comando gradle build como un comando de consola, estando en el directorio del proyecto
- Ejecutar el comando java -jar build/libs/RemoteControl-2.0.jar estando en el directorio del proyecto

-También es posible generar los archivos de eclipse mediante el comando gradle eclipse.

2. Eclipse
    2.1. Eclipse-Gradle
    - Instalar el plugin Buildship Gradle integration 2.0
    - Importar el proyecto como un proyecto de gradle
    - Ejecutar el proyecto a través del archivo src/main/java/com/leanfactory/remote/app/Application.java, el cual contiene el metodo main

3. IntelliJ
- Instalar el plugin de gradle
- Abrir la carpeta del proyecto en IntelliJ
- Esperar a que cargue las dependencias
- Ejecutar la aplicación través del archivo src/main/java/com/leanfactory/remote/app/Application.java, el cual contiene el metodo main

TESTS

De la misma forma, es posible ejecutar los test unitarios utilizando Gradle o un IDE. Para este caso, se utilizara la ruta src/test/java/com/leanfactory/test y el comando gradle test.


CONSIDERACIONES

Los diagramas UML se encuentran en la carpeta resources/uml. Los diagramas fueron creados con Astah Professional 7.2.0