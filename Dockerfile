# Usamos Tomcat como servidor
FROM tomcat:9.0

# Eliminamos la aplicación default de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiamos tu WAR al directorio webapps como ROOT.war
COPY deploy/recetas-backend-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Exponemos el puerto de Tomcat
EXPOSE 8080

# Comando para arrancar Tomcat
CMD ["catalina.sh", "run"]
