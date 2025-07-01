# Dockerfile para Spring Boot
FROM eclipse-temurin:17-jre-alpine

# Diretório de trabalho
WORKDIR /app

# Copia o jar gerado pelo Maven
COPY target/*.jar app.jar

# Expõe a porta usada pelo app
EXPOSE 9090

# Comando para rodar o app
ENTRYPOINT ["java","-jar","app.jar"]
