# Formlakal Test Automation

This repository contains an automated test suite developed to validate the core functionalities of the Formlakal web application. The project includes Selenium WebDriver–based UI automation and Java/JUnit logic tests to ensure accuracy, reliability, and stability across the platform.

# 1. Overview

The primary goal of this project is to test and verify:

User authentication flows (Login & Registration)

Front-end behavior and input validations

Error/success message handling

Navigation and form submission logic

Accuracy of health-related calculation modules (BMI, BMR, Body Fat Ratio)

Both automated browser tests and unit tests are included to achieve comprehensive coverage.

# 2. Automation Framework
✔ Selenium WebDriver (UI Automation)

Selenium is used to automate critical user flows and verify the behavior of UI elements.

Automated scenarios include:

Opening and navigating the Formlakal website

Filling and submitting login/register forms

Validating form field behavior

Checking DOM elements, button states, and error messages

Verifying redirects and page state after actions

These tests ensure a consistent and stable user experience.

✔ JUnit (Unit & Logic Testing)

Java-based unit tests validate the accuracy of Formlakal's health computation modules:

Body Mass Index (BMI)

Basal Metabolic Rate (BMR)

Body Fat Ratio

Tests cover correct formula execution, boundary values, numeric accuracy, and input validation.

# 3. Test Structure

📌 Authentication Tests

Covers:

Login success/failure

Registration success/failure

Form validation

UI element checks

Error message verification

📌 Calculation Logic Tests

Covers:

Formula correctness

Output accuracy

Boundary & edge cases

Invalid input handling

# 4. Technology Stack

Component	Technology

Programming Language	Java

UI Automation	Selenium WebDriver

Unit Testing Framework	JUnit

Browser	Google Chrome

Test Types	Automated UI Tests, Logic Tests

# 5. Quality Objectives

This test suite aims to ensure:

Functional Accuracy
All calculations and user actions produce correct results.

UI Stability
Forms, elements, and redirects behave consistently.

Automation Reliability
Tests are repeatable, maintainable, and scalable.

Code Quality
Test files follow clean structure and clear logic.
