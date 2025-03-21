# 🏨 Booking Automation Project

This repository contains the test automation for the **Booking** hotel reservation platform. It uses **SerenityBDD**, **selenium** with **Cucumber** and the **Screenplay** design pattern to ensure robust and maintainable tests.

## 📌 Technologies Used

- **Java 21**
- **SerenityBDD**
- **CucumberBDD**
- **Screenplay Pattern**
- **Gradle 8.6**
- **Selenium WebDriver**

## 📁 Project Structure

```
📦 booking-automation
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java/com/certificacion/HansJ/app
|   |   |   ├── 📂 driver SelfHealingDriver
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

### 1️⃣ Clone the repository
```sh
git clone git@github.com:hgomezcoron/Booking_HansJ_FuseQA.git
main: CI/CD logic
```

### 2️⃣ Configure dependencies with Gradle
```sh
gradle clean build
```

### 3️⃣ Run the tests

To execute the tests from the terminal:
```sh
gradle clean test
```
To generate the Serenity report:
```sh
gradle aggregate
```

## 🧪 Running Tests by Tags
You can run specific tests using tags:
```sh
gradle test -Dcucumber.options="--tags @Sorting"
```

## 📜  Implemented Scenarios
- **Hotel Search and Filtering** 
- **Flight Booking Process** 
- **User Login & Profile Update**
- **Hotel Details & Amenities Verification**

##Once the tests are executed, Serenity automatically generates a detailed test report. To view it, open:
```sh
target/site/serenity/index.html
```

## 🛠 Maintenance and Contribution
1. **Create a new branch for your improvement**: `git checkout -b feature/nueva-mejora`
2. **Make changes and commit:shCopiarEditar**: `git commit -m 'Añadir nueva funcionalidad'`
3. **Push the changes**: `git push origin feature/nueva-mejora`
4. **Open a Pull Request** 🛠

---

📌 **Contact:** For inquiries, reach out to[hgomezcoron@gmail.com](mailto:tu.email@example.com)
