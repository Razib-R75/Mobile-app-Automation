# Mobile App Automation Framework

This repository contains a Mobile App Automation Framework built with Java, Selenium, TestNG, and BDD, using the Page Object Model (POM) design pattern. Allure is used for generating detailed test reports.

## Table of Contents
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Framework Structure](#framework-structure)
- [Running the Tests](#running-the-tests)
- [Reporting](#reporting)
- [Built With](#built-with)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To get a local copy up and running, follow these steps.

### Prerequisites

- **Java**: Make sure you have JDK 8 or above installed. [Download Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven**: Ensure Maven is installed for dependency management. [Download Maven](https://maven.apache.org/download.cgi)
- **Node.js & Appium**: Appium should be installed and configured for mobile testing.
  ```sh
  npm install -g appium
  ```
- **IDE**: Any Java-supported IDE like IntelliJ or Eclipse.

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/Razib-R75/Mobile-app-Automation.git
   ```
2. Navigate to the project directory:
   ```sh
   cd mobile-app-automation
   ```
3. Install Maven dependencies:
   ```sh
   mvn clean install
   ```

## Framework Structure

```plaintext
src
├── main
│   └── java
│       └── com.example.app.automation.pages        # Page Object Model classes
├── test
│   └── java
│       └── com.example.app.automation.tests        # Test classes
│       └── com.example.app.automation.steps        # Step Definitions for BDD
│   └── resources
│       └── features                                # BDD feature files
├── pom.xml                                         # Maven dependencies
```

### Key Components

- **Page Object Model (POM)**: Organized with POM pattern to separate test scripts and UI elements.
- **BDD with TestNG**: Used for test case structuring and organization.
- **Allure Reporting**: Generates beautiful and detailed test reports.

## Running the Tests

To execute all tests, run:

```sh
mvn test
```

For running a specific suite, you can use:

```sh
mvn test -DsuiteXmlFile=<suite-file.xml>
```

## Reporting

Allure is used for reporting. After tests are executed, generate the report using:

```sh
allure serve allure-results
```

## Built With

- **Java** - Programming language for writing test scripts
- **Selenium** - For automating mobile web applications
- **TestNG** - Test framework for structuring and executing tests
- **Allure** - Reporting tool for visualizing test reports
- **BDD** - Behavior Driven Development for feature file management

## Contributing

Contributions are what make the open-source community such a fantastic place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE.txt` for more information.
