Instrucciones de instalación

-Instalar el JDK de Java (Se recomienda utilizar la version 1.8.151).

La ejecución de la aplicación se puede realizar a través de un IDE o a través de Gradle:

1. Gradle
- Instalar Gradle (Se recomienda utilizar la versión 4.4)
- Ejecutar el comando gradle build como un comando de consola, estando en el directorio del proyecto
- Ejecutar el comando java -jar build/libs/RemoteControl-1.0.jar estando en el directorio del proyecto

2. Eclipse
-Instalar eclipse (Se recomienda utilizar la versión oxygen)
    2.1. Eclipse-Gradle
    - Instalar el plugin Buildship Gradle integration 2.0
    - Importar el proyecto como un proyecto de gradle
    - Ejecutar el proyecto a través del archivo src/main/java/com/leanfactory/remote/core/Application.java, el cual contiene el metodo main

    2.2 Sólo eclipse
    - Importar el proyecto como un proyecto Java
    - Ejecutar el proyecto a través del archivo Application.java, el cual contiene el metodo main

De la misma forma, es posible ejecutar los test unitarios utilizando Gradle o un IDE. Para este caso, se utilizara la ruta src/test/java/com/leanfactory/test
