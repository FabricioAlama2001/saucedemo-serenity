INSTRUCCIONES DE EJECUCIÓN

1. Requisitos previos

Para ejecutar el proyecto se requiere:

- Git
- JDK 17
- Google Chrome
- IntelliJ IDEA o cualquier IDE compatible con proyectos Maven

Opcional:
- Apache Maven instalado localmente, solo si se desea ejecutar por terminal

2. Descargar el proyecto desde GitHub

Abrir una terminal y ejecutar:

git clone https://github.com/FabricioAlama2001/saucedemo-serenity.git

Luego ingresar a la carpeta del proyecto:

cd saucedemo-serenity


3. Abrir el proyecto en el IDE

Abrir IntelliJ IDEA y seleccionar la opción para abrir un proyecto existente.

Luego abrir la carpeta descargada del repositorio o directamente el archivo pom.xml.

Esperar a que el IDE reconozca el proyecto Maven y descargue las dependencias automáticamente.

4. Verificar configuración principal

Confirmar que el proyecto esté usando JDK 17.

El proyecto está configurado para ejecutarse con:
- Java 17
- Serenity BDD 5.3.7
- Maven Failsafe Plugin 3.2.5
- Google Chrome

5. Ejecutar la prueba desde IntelliJ IDEA

Ubicar la clase:

src/test/java/saucedemo/tests/SauceDemoPurchaseTest.java

Luego ejecutar esa clase como prueba JUnit.

También se puede ejecutar desde la ventana Maven del IDE usando el ciclo de vida:
- clean
- verify

6. Ejecutar por terminal (opcional)

Si la persona tiene Maven instalado localmente, puede ejecutar desde la raíz del proyecto:

mvn clean verify

7. Reporte generado

Al finalizar la ejecución, el reporte de Serenity se genera en la ruta:

target/site/serenity/index.html

8. Abrir el reporte

Ingresar a la carpeta:

target/site/serenity/

y abrir el archivo:

index.html

9. Tecnologías y versiones utilizadas

- JDK 17
- Serenity BDD 5.3.7
- Maven Failsafe Plugin 3.2.5
- Google Chrome
- Proyecto gestionado con Maven mediante archivo pom.xml

10. Observaciones

- El proyecto puede ejecutarse directamente desde IntelliJ IDEA sin necesidad de instalar Maven manualmente, siempre que el IDE gestione correctamente el proyecto Maven.
- Si se desea ejecutar por consola, sí es necesario contar con Maven instalado y configurado en el equipo.
- El archivo principal para la ejecución desde el IDE es:
  src/test/java/saucedemo/tests/SauceDemoPurchaseTest.java
- El proyecto genera el reporte automáticamente al finalizar la ejecución.