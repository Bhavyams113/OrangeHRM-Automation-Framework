# OrangeHRM Automation Framework

## Project Overview
This project is a Selenium Test Automation Framework developed using Java and TestNG.  
It automates key functional modules of the OrangeHRM demo application using the Page Object Model (POM) design pattern.

The framework covers end-to-end scenarios including:
- Login functionality
- Leave module navigation
- Recruitment module navigation

The objective of this project is to demonstrate automation testing skills, framework structure, and best practices.

---

## Tools & Technologies Used

- Java (JDK 21)
- Selenium WebDriver 4
- TestNG
- Maven
- ChromeDriver
- Page Object Model (POM)
- Git & GitHub

---

## Prerequisites

Before running the project, ensure you have the following installed:

- Java JDK 17 or above
- Maven
- Google Chrome browser
- ChromeDriver (compatible with Chrome version)
- IDE (Eclipse / IntelliJ)

---

## Setup Steps

1. Clone the repository:

   git clone <your-repository-link>

2. Open the project in Eclipse or IntelliJ.

3. Ensure Maven dependencies are downloaded automatically.

4. Verify ChromeDriver version matches your Chrome browser.

---

## Test Execution Steps

### Option 1: Run via IDE
- Right-click on test class
- Select Run As → TestNG Test

### Option 2: Run using TestNG XML
- Right-click on testng.xml
- Select Run As → TestNG Suite

### Option 3: Run via Maven
mvn clean test

---

##  Project Structure

src
 |__base
 |  |__BaseTest
 ├── pages
 │    ├── BasePage.java
 │    ├── LoginPage.java
 │    ├── LeavePage.java
 │    └── RecruitmentPage.java
 │
 ├── tests
 │    ├── LoginTest.java
 │    ├── LeaveTest.java
 │    └── RecruitmentTest.java

---

## Test Scenarios Covered

1. Valid Login Test
2. Verify Leave Page Navigation
3. Verify Recruitment Page Navigation

---

## Assumptions / Limitations

- This framework uses the OrangeHRM demo site.
- Only positive test scenarios are covered.
- No data-driven testing implemented.
- No reporting tool integrated (like Extent Reports).
- Tests are designed for Chrome browser only.

---

## Future Enhancements

- Implement Data-Driven Testing
- Add Screenshot on Failure
- Integrate Extent Reports
- Add Cross-browser testing
- CI/CD integration using Jenkins

---

## Author

Bhavya MS  
QA Automation Engineer