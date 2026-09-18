# Project Design Diagrams

This folder contains the design and documentation diagrams for the **Login Attack Detector** Java project.

## 1. System Architecture

[View System Architecture](system-architecture.md)

## 2. Workflow

[View Project Workflow](workflow.md)

## 3. Use Case Diagram

[View Use Case Diagram](use-case-diagram.md)

## 4. Class Diagram

[View Class Diagram](class-diagram.md)

## 5. Sequence Diagram

[View Sequence Diagram](sequence-diagram.md)

---

## Project Flow

The Login Attack Detector receives login activity, records successful and failed attempts, monitors failed attempts associated with IP addresses, determines the threat level, and generates a security report.

The system classifies activity into:

- LOW
- MEDIUM
- HIGH

A high-risk condition is detected when the failed-attempt threshold reaches 5.
