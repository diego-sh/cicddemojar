# Usar la imagen base de OpenJDK 21
FROM openjdk:21-jdk

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/demojar-0.0.1-SNAPSHOT.jar /app/appdemo.jar

# Ejecutar la aplicación Java
CMD ["java", "-jar", "/app/appdemo.jar"]
