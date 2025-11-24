# Usamos JDK 17
FROM eclipse-temurin:17-jdk-alpine

# Carpeta de trabajo
WORKDIR /app

# Copiamos el WAR al contenedor
COPY deploy/recetas-backend-1.0-SNAPSHOT.war app.war

# Exponemos el puerto
EXPOSE 8080

# Ejecutamos el WAR con Spring Boot
CMD ["java", "-jar", "app.war"]
