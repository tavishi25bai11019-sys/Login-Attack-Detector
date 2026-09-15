# Login Attack Detector

## Overview

Login Attack Detector is a Java-based security application designed to monitor login attempts and identify suspicious authentication activity.

The system analyzes successful and failed login attempts and determines the threat level based on the number of failed attempts.

The main purpose of the project is to demonstrate how Java programming concepts can be applied to a real-world cybersecurity problem.

## Problem

Repeated failed login attempts can indicate a possible brute-force attack.

Manually monitoring login activity can be difficult and time-consuming.

This project provides a simple automated mechanism to analyze login attempts and identify suspicious activity.

## Features

- User login attempt simulation
- Successful and failed login tracking
- Brute-force attack detection
- Threat-level classification
- IP address monitoring
- Security report generation
- User information management
- Login activity logging

## Functional Modules

### 1. Login Management
Records and manages login attempts made by users.

### 2. Attack Detection
Analyzes failed login attempts and identifies possible brute-force attacks.

### 3. Security Reporting
Generates a security report containing login statistics and threat level.

### 4. User Management
Stores user information such as username and IP address.

### 5. IP Monitoring
Monitors failed login activity associated with an IP address.

### 6. Login Logging
Maintains a record of login activity.

## Threat Levels

| Failed Attempts | Threat Level |
|---|---|
| 0–2 | LOW |
| 3–4 | MEDIUM |
| 5 or more | HIGH |

A HIGH threat level indicates a possible brute-force attack.

## Technologies Used

- Java
- Visual Studio Code
- Java Scanner
- Java ArrayList
- Java HashMap
- Object-Oriented Programming
- GitHub

## Project Structure

```text
LoginAttackDetector/
│
├── Main.java
├── LoginAttempt.java
├── LoginManager.java
├── AttackDetector.java
├── SecurityReport.java
├── User.java
├── IPMonitor.java
└── LoginLogger.java
