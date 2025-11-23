# 🍳 Recetas App - Sistema Fullstack

Una aplicación web completa para gestionar y organizar recetas de cocina, desarrollada con arquitectura fullstack utilizando **Spring Boot** en el backend y **React** en el frontend.

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-green?style=for-the-badge&logo=springboot)
![React](https://img.shields.io/badge/React-18-blue?style=for-the-badge&logo=react)
![MariaDB](https://img.shields.io/badge/MariaDB-11.0-lightblue?style=for-the-badge&logo=mariadb)

## ✨ Características Principales

- **📝 Gestión Completa de Recetas** - CRUD completo para recetas culinarias
- **🎯 Clasificación por Dificultad** - Organiza recetas por nivel de complejidad
- **🌐 API RESTful** - Backend robusto con endpoints bien definidos
- **⚡ Interfaz Moderna** - Frontend responsive y intuitivo con React
- **🔧 Arquitectura Separada** - Frontend y backend completamente independientes

## 🛠 Stack Tecnológico

### Backend
- **Java** - Lenguaje de programación
- **Spring Boot 3.2** - Framework principal
- **Spring Data JPA** - Persistencia de datos
- **MariaDB** - Base de datos relacional
- **Maven** - Gestión de dependencias

### Frontend
- **React 18** - Biblioteca de interfaz de usuario
- **Axios** - Cliente HTTP para consumo de APIs
- **CSS3** - Estilos y diseño responsive

### Herramientas de Desarrollo
- **IntelliJ IDEA** - IDE para desarrollo Java
- **VS Code** - Editor para desarrollo React
- **Git** - Control de versiones

## 🚀 Instalación y Configuración

### Prerrequisitos
- Java 17 o superior
- Node.js 16 o superior
- MariaDB 10.6 o superior
- Maven 3.6+

### 1. Clonar el Repositorio
```bash
git clone https://github.com/itscarlosvg/RecetasApp.git
cd RecetasApp
```

### 2. Configuración de la Base de Datos
```sql
CREATE DATABASE recetas_db;
CREATE USER 'usr_recetas'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON recetas_db.* TO 'usr_recetas'@'localhost';
FLUSH PRIVILEGES;
```

### 3. Backend (Spring Boot)
```bash
# Configurar application.properties
# Editar src/main/resources/application.properties con tus credenciales:
# spring.datasource.url=jdbc:mariadb://localhost:3306/recetas_db
# spring.datasource.username=recetas_user
# spring.datasource.password=password
```

### 4. Frontend (React)
```bash
# Instalar dependencias
npm install

# Ejecutar en modo desarrollo
npm start
```

## 💡 Uso de la Aplicación

1. **Agregar Receta**: Completa el formulario con nombre y selecciona dificultad
2. **Ver Lista**: Las recetas se muestran automáticamente con su dificultad
3. **Gestión**: El sistema mantiene la integridad de datos entre frontend y backend

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Para contribuir:

1. Haz fork del proyecto
2. Crea una rama para tu feature (`git checkout -b feature/nueva-caracteristica`)
3. Commit tus cambios (`git commit -m 'Agrega nueva característica'`)
4. Push a la rama (`git push origin feature/nueva-caracteristica`)
5. Abre un Pull Request
