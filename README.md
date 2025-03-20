# 🏨 Booking Automation Project

Este repositorio contiene la automatización de pruebas para la plataforma de reservas de hoteles **Booking**. Se utiliza **SerenityBDD** con **Cucumber** y el patrón de diseño **Screenplay** para garantizar pruebas robustas y mantenibles.

## 📌 Tecnologías utilizadas

- **Java 21**
- **SerenityBDD**
- **CucumberBDD**
- **Screenplay Pattern**
- **Gradle 8.6**
- **Selenium WebDriver**

## 📁 Estructura del Proyecto

```
📦 booking-automation
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java/com/certificacion/HansJ/app
│   │   │   ├── 📂 tasks
│   │   │   ├── 📂 questions
│   │   │   ├── 📂 interactions
│   │   │   ├── 📂 userinterfaces
│   │   │   ├── 📂 utils
│   ├── 📂 test
│   │   ├── 📂 java/com/certificacion/HansJ/app/runners
│   │   ├── 📂 resources/features
├── 📜 build.gradle
├── 📜 serenity.conf
├── 📜 README.md
```

## 🚀 Instalación y Configuración

### 1️⃣ Clonar el repositorio
```sh
git clone https://github.com/tu-usuario/booking-automation.git
cd booking-automation
```

### 2️⃣ Configurar dependencias con Gradle
```sh
gradle clean build
```

### 3️⃣ Ejecutar las pruebas

Para ejecutar las pruebas en la terminal:
```sh
gradle test
```
Para generar el reporte de Serenity:
```sh
gradle aggregate
```

## 🧪 Ejecución de pruebas por etiquetas
Puedes ejecutar pruebas específicas con **tags**:
```sh
gradle test -Dcucumber.options="--tags @Sorting"
```

## 📜 Escenarios Implementados
- **Búsqueda de hoteles** 🏨
- **Filtrado por calificación de usuario** ⭐
- **Ordenamiento por precio** 💰

## 🛠 Mantenimiento y Contribución
1. **Crea un branch** con tu mejora: `git checkout -b feature/nueva-mejora`
2. **Realiza cambios y haz commit**: `git commit -m 'Añadir nueva funcionalidad'`
3. **Sube los cambios**: `git push origin feature/nueva-mejora`
4. **Haz un Pull Request** 🛠

## 📄 Licencia
Este proyecto se encuentra bajo la licencia **MIT**.

---

📌 **Contacto:** Para consultas, escribe a [tu.email@example.com](mailto:tu.email@example.com)
